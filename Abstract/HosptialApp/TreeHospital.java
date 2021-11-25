package com.xworkz.Abstract.HosptialApp;

public class TreeHospital extends HosptialRegistrationApp {

	public TreeHospital() {
		System.out.println("welcome to Tree hospital");
	}

	public void timingsOfHosptial() {
		System.out.println("avaiable at 9am to 12 pm");
	}

	@Override
	public void addresOfHosptial() {
		System.out.println("banglore - jaynagar");
	}

	@Override
	public void specializationAt() {
		System.out.println("children specialist");
	}
}
