package com.home.design.state;

public class SoldOutState implements State {
	CokeVendingMachine vendingMachine;
	
	public SoldOutState(CokeVendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertDollar() {
		System.out.println("You can't insert, the machine is sold out.");
	}

	@Override
	public void ejectDollar() {
		System.out.println("You can't eject, the machine is sold out.");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, the machine is sold out.");
	}

	@Override
	public void dispense() {
		System.out.println("The machine is sold out.");
	}
	
	@Override
	public String toString() {
		return "Sold out";
	}

}
