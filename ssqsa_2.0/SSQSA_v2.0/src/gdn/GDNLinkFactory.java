package gdn;

import org.apache.commons.collections15.Factory;

public class GDNLinkFactory implements Factory
{
   
    public GDNLink create()
    {    	
        return (new GDNLink());
    }
}

