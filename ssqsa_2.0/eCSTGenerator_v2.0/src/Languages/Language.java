package Languages;
import java.util.*;

public class Language {
	private String name;
	private String lexer;
	private String parser;
	private String startRule;
	private String returnClass;
	private boolean caseSensitive;
	
	private ArrayList<String> extensions;
	
	public Language(){
		this.setExtensions(new ArrayList<String>());
	}
	
	public Language(String name, String lexer, String parser){
		this.setName(name);
		this.setLexer(lexer);
		this.setParser(parser);
		this.setExtensions(new ArrayList<String>());
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param lexer the lexer to set
	 */
	public void setLexer(String lexer) {
		this.lexer = lexer;
	}


	/**
	 * @return the lexer
	 */
	public String getLexer() {
		return lexer;
	}


	/**
	 * @param parser the parser to set
	 */
	public void setParser(String parser) {
		this.parser = parser;
	}


	/**
	 * @return the parser
	 */
	public String getParser() {
		return parser;
	}


	/**
	 * @param startRule the startRule to set
	 */
	public void setStartRule(String startRule) {
		this.startRule = startRule;
	}

	/**
	 * @return the startRule
	 */
	public String getStartRule() {
		return startRule;
	}

	/**
	 * @param returnClass the returnClass to set
	 */
	public void setReturnClass(String returnClass) {
		this.returnClass = returnClass;
	}

	/**
	 * @return the returnClass
	 */
	public String getReturnClass() {
		return returnClass;
	}
	
	/**
	 * @param caseSensitive the caseSensitive to set
	 */
	public void setCaseSensitive(boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
	}


	/**
	 * @return is caseSensitive
	 */
	public boolean isCaseSensitive() {
		return caseSensitive;
	}

	/**
	 * @param extensions the extensions to set
	 */
	public void setExtensions(ArrayList<String> extensions) {
		this.extensions = extensions;
	}


	/**
	 * @return the extensions
	 */
	public ArrayList<String> getExtensions() {
		return extensions;
	}
	
	public boolean addExtension(String extension){
		return extensions.add(extension);
	}
	
	
	

}
