package com.home.design.strategy;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real mallard duck!");
	}

}
