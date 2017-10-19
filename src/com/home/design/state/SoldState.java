package com.home.design.state;

/**
 * @author AMondal
 *
 */
public class SoldState implements State {
	CokeVendingMachine vendingMachine;
	
	public SoldState(CokeVendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertDollar() {
		System.out.println("You can't insert, the machine is sold out.");
	}

	@Override
	public void ejectDollar() {
		System.out.println("You can't eject, the machine is sold out. ");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, the machine is sold out.");
	}

	@Override
	public void dispense() {
		vendingMachine.releaseBottle();
		if(vendingMachine.count > 0){
			vendingMachine.setState(vendingMachine.getNoCreditState());
		} else { 
			System.out.println("No more coke..");
			vendingMachine.setState(vendingMachine.getSoldOutState());
		}	
	}
	
	@Override
	public String toString() {
		return "Sold state";
	}
}
