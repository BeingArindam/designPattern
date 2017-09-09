package com.cts.design.singleton;

import org.junit.Test;

import junit.framework.Assert;

public class SecureSingletonTest {

	@Test
	public void test() throws InstantiationException {
		final SecureSingleton instance = SecureSingleton.getInstance();
		final SecureSingleton instance2 = SecureSingleton.getInstance();

		Assert.assertEquals(instance, instance2);

		try {
			final Object newInstance = Class.forName("com.cts.design.singleton.SecureSingleton").newInstance();
			Assert.assertTrue(false);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			Assert.assertTrue(true);
		}

	}

}
