package com.home.design.decorator;

public class Espresso extends Beverage {
	
	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.98;
	}

}
