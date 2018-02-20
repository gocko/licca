/*
 * Copyright (C) 2012-2013 by Milos Savic
 *
 * Permission to use, copy, modify, and distribute this software and its
 * documentation under the terms of the GNU General Public License is hereby 
 * granted. See the GNU General Public License for more details.
 */

package ecst;

public class ECSTLoaderException extends Exception {

	private static final long serialVersionUID = -3267742917238133180L;

	private String msg;
	private Exception e;
	
	public ECSTLoaderException(String msg, Exception e) {
		super(msg, e);
		this.msg = msg;
		this.e = e;
	}
	
	public ECSTLoaderException(String msg) {
		super(msg);
		this.msg = msg;
		this.e = null;
	}
	
	public void dump() {
		System.out.println("ECSTLoaderException: " + msg);
		if (e != null)
			e.printStackTrace();
	}
}
