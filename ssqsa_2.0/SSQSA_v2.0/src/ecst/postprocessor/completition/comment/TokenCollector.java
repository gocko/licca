package ecst.postprocessor.completition.comment;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;

public class TokenCollector implements TokenSource{

	private final TokenSource source;
	private final LinkedList<Token> collectedTokens = new LinkedList<Token>();
	
	private final Map<Integer, String> channelNamePair = new HashMap<Integer, String>();
	
	public TokenCollector(TokenSource source, HashMap<Integer, String> channelNamePair){
		super();
		this.source = source;
		this.channelNamePair.putAll(channelNamePair);
	}
	
	@Override
	public String getSourceName() {
		return "Collect hidden channel " + source.getSourceName();
	}

	@Override
	public Token nextToken() {
		Token nextToken = source.nextToken();
		if(shouldCollect(nextToken)){
			collectedTokens.add(nextToken);
		}
		return nextToken;
	}
	
	private boolean shouldCollect(Token token){
		if (channelNamePair.containsKey(token.getChannel())){
			return true;
		} else return false;
	}

	public LinkedList<Token> getCollectedTokens() {
		return collectedTokens;
	}
	
	public LinkedList<CommonTree> wrapTokens(){
		
		LinkedList<CommonTree> nodes = new LinkedList<CommonTree>();
		
		for(Token token : collectedTokens){
			CommonTree node = new CommonTree();
			String universalNodeName = channelNamePair.get(token.getChannel());
			int tokenType = token.getType();
			
			UniversalToken universalToken = new UniversalToken(tokenType, universalNodeName, 0, -1, -1);
			node.token = universalToken;
			node.addChild(new CommonTree(token));
			nodes.add(node);
		}	
		
		return nodes;
	}
	
	public LinkedList<CommonTree> getOnlyFromChannel(int channel){
		
		LinkedList<CommonTree> nodes = new LinkedList<CommonTree>();
		
		for(Token token : collectedTokens){
			if(token.getChannel() == channel){
				CommonTree node = new CommonTree();
				String universalNodeName = channelNamePair.get(token.getChannel());
				int tokenType = token.getType();
				
				UniversalToken universalToken = new UniversalToken(tokenType, universalNodeName, 0, -1, -1);
				node.token = universalToken;
				node.addChild(new CommonTree(token));
				nodes.add(node);
			}
		}
		
		return nodes;
	}
	
	

}
