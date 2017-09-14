package com.cts.design.singleton;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/**
 * @author arindam
 *
 *         There is serialization.
 *
 */
public class SecureSingleton implements Cloneable, Serializable {
	private static final long serialVersionUID = 8839305695372212562L;
	private static SecureSingleton singleton;

	private SecureSingleton() throws InstantiationException {
		if (singleton != null) {
			throw new InstantiationException("Object alreday initiated");
		}
	}

	public static synchronized SecureSingleton getInstance() {
		if (singleton == null) {
			try {
				singleton = new SecureSingleton();
			} catch (InstantiationException e) {
				e.printStackTrace();
			}
		}
		return singleton;
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException{
		ois.defaultReadObject();
		singleton = getInstance();
	}
	
	private Object readResolve()  {
	    return singleton;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone is not supported.");
	}
}
