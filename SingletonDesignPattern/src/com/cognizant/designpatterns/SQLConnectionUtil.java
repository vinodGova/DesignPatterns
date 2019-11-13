package com.cognizant.designpatterns;

import java.io.Serializable;

public class SQLConnectionUtil implements Serializable,Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	// Lazy initialization
	private static SQLConnectionUtil connectionUtil = null;
	
	
   //Instead of making whole method as synchronized ,it is enough to enclose only the conditional check in synchronized block. and it's performance wise it's good.
	public static SQLConnectionUtil creatConnection() {

		if (connectionUtil == null) {
			synchronized (SQLConnectionUtil.class) {

				if (connectionUtil == null) {

					connectionUtil = new SQLConnectionUtil();
				}
			}
		}

		return connectionUtil;
	}
	
	//For avoid creating more than one objects of the singleton class even we serialized and de_serialized also.
	protected Object readResolve()
	{
		return connectionUtil;
	}
	
	//For avoid creating more than one objects of the singleton class even in Cloning also.
	protected Object clone()throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	
}
