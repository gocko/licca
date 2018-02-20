/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package gdn; 

public enum GDNLinkType {
	CONTAINS,
	REFERENCES,
	CALLS,
	GLOBAL_VAR,
	LOCAL_VAR,
	FUNC_PARAM,
	FUNC_RET,
	INSTANTIATES,
	IMPLEMENTS,
	EXTENDS,
	ACCESS;
	
	public static String desc(GDNLinkType linkType) {
		switch (linkType) {
			case CONTAINS:     return "CONTAINS";
			case REFERENCES:   return "REFERENCES";
			case CALLS:        return "CALLS";
			case GLOBAL_VAR:   return "GLOBAL_VAR";
			case LOCAL_VAR:    return "LOCAL_VAR";
			case FUNC_PARAM:   return "FUNC_PARAM";
			case FUNC_RET:     return "FUNC_RET";
			case INSTANTIATES: return "INSTANTIATES";
			case IMPLEMENTS:   return "IMPLEMENTS";
			case EXTENDS:      return "EXTENDS";
			case ACCESS:       return "ACCESS";
			default:           return "UNKNOWN_GDN_LINK_TYPE";
		}
	}
}
