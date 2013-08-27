package com.microsoft.adcenter;

/**
 * Created by IntelliJ IDEA.
 * User: simon
 * Date: Nov 16, 2010
 * Time: 4:02:13 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class FaultException extends java.rmi.RemoteException {

    public FaultException() {
    		super();
    }

    public FaultException(String message) {
        super(message);
    }

    public FaultException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public FaultException(java.lang.Throwable cause) {
    	  super();	
    	  initCause(cause);
    }

    public abstract Object getFaultMessage();
    
}
