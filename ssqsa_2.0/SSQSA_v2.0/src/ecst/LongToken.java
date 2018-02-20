package ecst;


public class LongToken {
	private String text;
	private String index;
	private String type;
	private String line;
	private String column;
	
	public LongToken(String text, String index, String type, String line, String column){
		this.setText(text);
		this.setIndex(index);
		this.setType(type);
		this.setLine(line);
		this.setColumn(column);
	}

	public LongToken(String text) {
		this.setText(text);
		
	}

	public String getText(){
		return text;
	}
	
	public String getIndex(){
		return index;
	}
	
	
	public String getType(){
		return type;
	}
	
	public String getLine(){
		if (line == null){
			return "";
		}
		return line;
	}
	
	public int lineToInt(){		
		int l = -2;
		toInt(line);
		return l;
	}

	private void toInt(String s) {
		int l;
		try{
			l = Integer.parseInt(s);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
	
	public String getColumn(){
		if (line == null){
			return "";
		}
		return column;
	}

	protected void setText(String text) {
		this.text = text;
	}

	protected void setIndex(String index) {
		this.index = index;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected void setLine(String line) {
		this.line = line;
	}

	protected void setColumn(String column) {
		this.column = column;
	}
}
