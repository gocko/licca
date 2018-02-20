package ecst.postprocessor.completition.comment;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;

public class UniversalToken implements Token{
	private int type;
	private String text;
	private int line;
	private int tokenIndex;	
	private int charPositionInLine;
	
	private int channel;		
	private CharStream inputStream;	
	
	public UniversalToken(int type, String text, int line, int index, int column){			
		this.type = type;
		this.text = text;
		this.line = line;
		this.tokenIndex = index;
		this.charPositionInLine = column;
	}
	
	@Override
	public int getChannel() {
		return channel;
	}

	@Override
	public int getCharPositionInLine() {
		return charPositionInLine;
	}

	@Override
	public CharStream getInputStream() {
		return inputStream;
	}

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public int getTokenIndex() {
		return tokenIndex;
	}

	@Override
	public int getType() {
		return type;
	}

	@Override
	public void setChannel(int arg0) {

		this.channel = arg0;
		
	}

	@Override
	public void setCharPositionInLine(int arg0) {
		this.charPositionInLine = arg0;
	}

	@Override
	public void setInputStream(CharStream arg0) {
		this.inputStream = arg0;	
		
	}

	@Override
	public void setLine(int arg0) {
		this.line = arg0;
		
	}

	@Override
	public void setText(String arg0) {
		this.text = arg0;
		
	}

	@Override
	public void setTokenIndex(int arg0) {
		this.tokenIndex = arg0;
		
	}

	@Override
	public void setType(int arg0) {
		this.type = arg0;
		
	}
	
}
