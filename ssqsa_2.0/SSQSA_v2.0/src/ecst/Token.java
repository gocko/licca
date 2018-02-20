package ecst;

public class Token {
	protected String text;
	protected String index;
	protected String type;
	protected int line;
	protected String column;

	public String getText(){
		return text;
	}
	
	public String getIndex(){
		return index;
	}
	
	public String getType(){
		return type;
	}
	
	public int getLine(){
		return line;
	}
	
	public String getColumn(){
		return column;
	}
}
