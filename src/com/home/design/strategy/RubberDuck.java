package com.home.design.strategy;

public class RubberDuck extends Duck {

	public RubberDuck() {
		setFlyBehavior(new NoFly());
		setQuackBehavior(new Squeak());
	}

	@Override
	public void display() {
		System.out.println("I'm a rubber duckie!!");

	}

}
