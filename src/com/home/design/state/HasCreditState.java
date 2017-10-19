package com.home.design.state;

public class HasCreditState implements State {
	CokeVendingMachine vendingMachine;
	
	public HasCreditState(CokeVendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertDollar() {
		System.out.println("You already has enough credit");
	}

	@Override
	public void ejectDollar() {
		System.out.println("Credit return");
		vendingMachine.setState(vendingMachine.getNoCreditState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		vendingMachine.setState(vendingMachine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("No coke dispense.");
	}
	
	@Override
	public String toString() {
		return "Has credit";
	}

}
