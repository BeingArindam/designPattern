package com.home.design.strategy;

public class SuperFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying too fast!!");
	}

}
