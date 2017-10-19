package com.home.design.state;

public class NoCreditState implements State {
	CokeVendingMachine vendingMachine;
	
	public NoCreditState(CokeVendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertDollar() {
		System.out.println("You inserted a dollar");
		vendingMachine.setState(vendingMachine.getHasDollarState());
	}

	@Override
	public void ejectDollar() {
		System.out.println("You haven't inserted a dollar");
	}

	@Override
	public void turnCrank() {
		System.out.println("You haven't inserted a dollar.");
	}

	@Override
	public void dispense() {
		System.out.println("You haven't inserted a dollar.");
	}
	
	@Override
	public String toString() {
		return "No credit";
	}
	
}
