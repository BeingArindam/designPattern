package com.home.design.state;

public class CokeVendingMachineTest {

	public static void main(String[] args) {
		CokeVendingMachine machine = new CokeVendingMachine(5);
		System.out.println(machine);
		machine.insertDollar();
		machine.turnCrank();

		System.out.println(machine);

		machine.insertDollar();
		machine.turnCrank();

		System.out.println(machine);

		machine.insertDollar();
		machine.turnCrank();

		System.out.println(machine);

		machine.insertDollar();
		machine.turnCrank();

		System.out.println(machine);

		machine.insertDollar();
		machine.turnCrank();

		System.out.println(machine);

		machine.insertDollar();
		machine.turnCrank();
	}

}
