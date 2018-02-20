package eCSTGenerator;
import java.util.Date;


public class eCSTGenerator{

	/**
	 * @param args
	 */
	private String inDir; 
	private String outDir;
	
	private ParsingConvertor pc;
	
	public eCSTGenerator(String inputDir, String outputDir){
		System.out.println("eCSTGenerator started (" + new Date().toString() + ")");
		this.inDir = inputDir; 
		this.outDir = outputDir;
		try{
			pc = new ParsingConvertor(inDir, outDir);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void doJob(){
		
		//pc.parse();
		//pc.tc.close();
		System.out.println("eCSTGenerator finished (" + new Date().toString() + ")");
		
	}

	
	public static void main(String[] args) throws Exception {
		
		
		if (args.length != 2) {
			System.out.println("eCSTGenerator <sourceCodeDir> <ecstDir>");
			return;
		}
		
		String inDir = args[0];
		String outDir = args[1];
		
		eCSTGenerator eCSTGen = new eCSTGenerator(inDir, outDir);
		
		eCSTGen.doJob();
		
		
	
	}

}
