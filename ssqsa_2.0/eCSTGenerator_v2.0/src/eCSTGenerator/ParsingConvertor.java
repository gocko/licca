package eCSTGenerator;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Date;
import org.antlr.runtime.*; 
import org.antlr.runtime.tree.*;

import Languages.*;
import treeCheckers.*;
import util.*;
import XMLManipulator.*;

public class ParsingConvertor {
	String inDir = "", outDir = "";
	
	Languages langs;
	private LinkedList<String> compilationUnits;
	InputOutputManipulator iom; 
	CommonTree ecst;
	private TreeChecker tc;
	Lexer lexer;
	Parser parser;
	ParserRuleReturnScope returnClass;
	private int loc = 0;
	private int locWoEmpty = 0;
	private int numEcstNodes = 0;

	
	public ParsingConvertor(String inDir, String outDir) throws Exception{
		
		iom = new InputOutputManipulator(inDir, outDir);
		langs = new Languages();
		compilationUnits = new LinkedList<String>();
		collectCompilationUnits(inDir, langs); 
		locCalculator();
		tc = new TreeChecker(outDir + File.separator + "TreeCheckersLog.txt");	
		parse();
		tc.close();
	}
	
	public ParsingConvertor() {
		langs = new Languages();
	}
		
	private void collectCompilationUnits(String inDir, Languages langs) {
		LinkedList<String> exts = new LinkedList<String>();		
			
		for(int i = 0; i < langs.getNumberOfLanguages(); i++) {
			ArrayList<String> lexts = langs.getLanguage(i).getExtensions();
			for (int j = 0; j < lexts.size(); j++) {
				exts.add(lexts.get(j));
			}
		}
		
		DirectoryWalker dw = new DirectoryWalker(inDir, exts);
		compilationUnits = dw.getFiles();
	}
	
	
	private void parse(){		
		
				
		
		File f;		
		
		
		Iterator<String> it = compilationUnits.iterator();
		
		int succParsed = 0;
		
				
		while (it.hasNext()){				
				try{
					String compUnit = it.next();
					//	String lastModified = "" + dir.lastModified();
					f = new File(compUnit);
					ecst = new CommonTree();
					String cuOutDir = iom.prepareOutdir(compUnit);
					//String ecstName = getPureFileName(compUnit);
					boolean ok = parseFile(compUnit, f, cuOutDir) != null;
					if  (ok && (ecst != null)){
						succParsed++;
						tc.check(ecst, compUnit);
						numEcstNodes += numNodes(ecst);						
					}
					else{
						System.out.println("[eCSTGenerator ERROR] - " + compUnit + " parse errors");
					}
					
				}catch(Exception e){
					e.printStackTrace();
				}
				
		}
		if (succParsed == compilationUnits.size()) {
			System.out.println("[eCSTGenerator status: OK] - " + compilationUnits.size() + " compilation units " 
					           + "(LOC: " + loc + ", LOCwoEmpty: " + locWoEmpty + ", ecstNodes: " + numEcstNodes + ") "
					           + "succesfully parsed"); 
		} else {
			System.out.println("[eCSTGenerator status: ERROR] - " + 
		                        (compilationUnits.size() - succParsed) + " / " + compilationUnits.size() + 
		                        " parse errors");
		}
	}
				
			

	public String parseFile(String compUnit, File f, String outDir) {
		String fileName = f.getName();
		
		CharStream input = null;
		try{
			input = new ANTLRFileStream(compUnit);
		}catch(Exception e){}
		
		
		
		String extension = FileFind.findExtension(fileName);			
			
		Language lang = langs.findLanguage(extension);
		
		if (lang != null){
			String lexerName = lang.getLexer();
			String parserName = lang.getParser();
			String startRuleName = lang.getStartRule();		
			

			lexerInit(input, lexerName);			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parserInit(tokens, parserName);
			
			try{
					java.lang.reflect.Method startRuleMethod = parser.getClass().getMethod(startRuleName); 
					returnClass = (ParserRuleReturnScope)startRuleMethod.invoke(parser, null);
			}
			catch (Exception e){
				System.out.println("Start rule recognition exception for " + startRuleName);
				System.out.println(e.toString());
			}
				
			if (returnClass!=null){
				String tree = ((CommonTree)returnClass.getTree()).toStringTree();
				System.out.println("tree: "+ tree);
				try{
					ecst = (CommonTree)returnClass.getClass().getMethod("getTree", null).invoke(returnClass, null);				
				}
				catch (Exception e){
					System.out.println("Method recognition exception for getTree method");
					System.out.println(e.toString());
				}
				
				String outFile = converteCSTtoXML(ecst, f, outDir, lang.isCaseSensitive()); 
				
				return outFile;			
			}
			else{
				System.out.println("eCST Error!!!" );
			}
		}
		else{
			System.out.println("Inut language is not reccognized. Extension: "+ extension);
			LOG.error("Unrecognized language for compilation unit: " + compUnit);
			
		}
		return null;

			
		

	}
	
	public static String converteCSTtoXML(CommonTree ct, File f, String outDir, boolean caseSensitive){
	
		String output = "";
		String fileName = f.getName();
		String lastModified = "" + f.lastModified();
		//String ecstPath = cuOutDir + File.separatorChar + ecstName + ".xml";
		
		try{
					
		//ovde pravimo XML eCST
			output = XMLeCSTWrite.newXMLeCST(ct, outDir, fileName, lastModified, caseSensitive);
		
		}catch(Exception e){}
		return output;
		
	}
	
	private void lexerInit(CharStream input, String lexerName){
		
		try{
			Class<Lexer>  lexerClass = (Class<Lexer>)Class.forName(lexerName);
			Constructor con = lexerClass.getConstructor(CharStream.class);
			lexer = (Lexer)con.newInstance(new Object[]{input});
		}
		catch (Exception e){
			System.out.println("Lexer recognition exception for " + lexerName);
				System.out.println(e.toString());
		} 
	}
	
	private void parserInit(CommonTokenStream tokens, String parserName){
		try{
			Class  parserClass = Class.forName(parserName);
			Constructor con = parserClass.getConstructor(TokenStream.class);
			parser = (Parser)con.newInstance(new Object[]{tokens});
		}
		catch (Exception e){
			System.out.println("Parser recognition exception for " + parserName);
			System.out.println(e.toString());
		} 
	}
	
	private void locCalculator() {
		for (int i = 0; i < compilationUnits.size(); i++) {
			String cu = compilationUnits.get(i);
			
			try {
				BufferedReader br = new BufferedReader(new FileReader(cu));
				String s = "";
				int _loc = 0;
				int _locWoEmpty = 0;
				while ((s = br.readLine()) != null) {
					_loc++;
					if (s.length() > 0)
						_locWoEmpty++;
				}
				
				loc += _loc;
				locWoEmpty += _locWoEmpty;
				
				br.close();
			} catch (IOException e) {
				System.out.println("LocCalculator error: ");
				e.printStackTrace();
			}
		}
	}
	
	private int numNodes(CommonTree tree) {
		int cnt = 0;
		
		LinkedList<Tree> queue = new LinkedList<Tree>();
		queue.add(tree);
		
		while (queue.size() > 0) {
			Tree current = queue.removeFirst();
			++cnt;	
			int numChildrens = current.getChildCount();
			for (int i = 0; i < numChildrens; i++) {
				Tree child = current.getChild(i);
				queue.addLast(child);
			}
		}
		
		return cnt;
	}
	
}
