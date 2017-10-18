package com.home.design.strategy;

public class DuckSimulator {

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		RubberDuck rubberDuck = new RubberDuck();
		DecoyDuck decoyDuck = new DecoyDuck();
		
		ModelDuck modelDuck = new ModelDuck();
		
		mallardDuck.performQuack();
		rubberDuck.performQuack();
		decoyDuck.performQuack();
		
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new SuperFly());
		modelDuck.performFly();
	}

}
