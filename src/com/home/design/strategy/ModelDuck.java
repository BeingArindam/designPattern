package com.home.design.strategy;

public class ModelDuck extends Duck {

	public ModelDuck() {
		setFlyBehavior(new NoFly());
		setQuackBehavior(new MuteQuack());
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck!!");
	}

}
