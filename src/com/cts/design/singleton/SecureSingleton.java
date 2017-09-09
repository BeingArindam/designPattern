package com.cts.design.singleton;

/**
 * @author arindam
 *
 */
public class SecureSingleton {
	private static SecureSingleton singleton;

	private SecureSingleton() throws InstantiationException {
		if (singleton != null) {
			throw new InstantiationException("Object alreday initiated");
		}
	}

	public static synchronized SecureSingleton getInstance() throws InstantiationException {
		if (singleton == null) {
			singleton = new SecureSingleton();
		}
		return singleton;
	}
}
