package com.home.design.strategy;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		setFlyBehavior(new NoFly());
		setQuackBehavior(new MuteQuack());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a decoy");
	}

}
