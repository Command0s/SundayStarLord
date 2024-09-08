package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void iDoor() {
		System.out.println("My car has 4 doors");
	}

	@Override
	public String iLock() {
		return "Automatic";
	}

	@Override
	public int iMilege() {
		return 10;
	}

}
