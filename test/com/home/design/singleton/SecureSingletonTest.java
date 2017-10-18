package com.home.design.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.home.design.singleton.SecureSingleton;

public class SecureSingletonTest {

	@Test
	public void test() throws InstantiationException {
		final SecureSingleton instance = SecureSingleton.getInstance();
		final SecureSingleton instance2 = SecureSingleton.getInstance();

		assertEquals(instance, instance2);

		try {
			Class.forName("com.cts.design.singleton.SecureSingleton").newInstance();
			assertTrue(false);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			assertTrue(true);
		}

	}

}
