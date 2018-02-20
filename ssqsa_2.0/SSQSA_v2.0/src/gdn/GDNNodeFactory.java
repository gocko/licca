package gdn;

import org.apache.commons.collections15.Factory;

public class GDNNodeFactory implements Factory
{
   
	private String name;
	private GDNNodeType type;
	
	public GDNNodeFactory(String name, GDNNodeType type){
		this.name = name;
		this.type =type;
	}
    public GDNNodeFactory() {
	
	}
	public GDNNode create()
    {    	
        return (new GDNNode());
    }
}

