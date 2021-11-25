package com.xworkz.Abstract.HosptialApp;

public abstract class HosptialRegistrationApp {

	public void openWebsite(String url) {
		System.out.println("opened website");
	}

	public void registerUsingPhoneNumber(long number) {
		System.out.println("register successfully");
	}

	abstract public void timingsOfHosptial();

	abstract public void addresOfHosptial();

	abstract public void specializationAt();

	public void closewebsite() {
		System.out.println("closed");
	}
}
