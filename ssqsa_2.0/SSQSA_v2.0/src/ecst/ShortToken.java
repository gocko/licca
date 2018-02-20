package ecst;



public class ShortToken {
	private String text;
	
	
	private String line;
	private String column;
	
	
	public ShortToken(String text) {
		this.setText(text);
		
	}

	public ShortToken(String text, String line, String column){
		this.setText(text);
		this.setLine(line);
		this.setColumn(column);
	}

	public String getText(){
		return text;
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

	
	protected void setLine(String line) {
		this.line = line;
	}

	protected void setColumn(String column) {
		this.column = column;
	}
}
