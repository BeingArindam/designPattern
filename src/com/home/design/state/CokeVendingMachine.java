package com.home.design.state;

public class CokeVendingMachine {
	State soldOutState;
	State noCreditState;
	State hasDollarState;
	State soldState;
	
	State state = soldOutState;
	int count = 0;
	
	public CokeVendingMachine(int numberOfCokeBottle) {
		noCreditState = new NoCreditState(this);
		soldOutState = new SoldOutState(this);
		hasDollarState = new HasCreditState(this);
		soldState  = new SoldState(this);
		
		count = numberOfCokeBottle;
		if(numberOfCokeBottle > 0)
			state = noCreditState;
	}
	
	public void insertDollar(){
		state.insertDollar();
	}

	public void ejectDollar(){
		state.ejectDollar();
	}

	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	
	public void releaseBottle(){
		System.out.println("A bottle of coke going out..");
		if(count != 0)
			count--;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoCreditState() {
		return noCreditState;
	}

	public void setNoCreditState(State noCreditState) {
		this.noCreditState = noCreditState;
	}

	public State getHasDollarState() {
		return hasDollarState;
	}

	public void setHasDollarState(State hasDollarState) {
		this.hasDollarState = hasDollarState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}

	public void refill(int count) {
		this.count = count;
		state = noCreditState;
	}

	@Override
	public String toString() {
		return "CokeVendingMachine [state=" + state + ", count=" + count + "]";
	}
	
}
