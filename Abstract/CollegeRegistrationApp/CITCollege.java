package com.xworkz.Abstract.CollegeRegistrationApp;

public class CITCollege extends CollegeRegistrationApp {
	
	public CITCollege() {
		System.out.println("welcome to cit college");
	}

	public void collegeName() {
		System.out.println("cit college");
	}

	public void BranchName() {
		System.out.println("ISE,CSE,EEE,ECE,ME,CV");
	}

	@Override
	public void feesStructure() {
		System.out.println(" 2Lakhs to 4 Lakhs ");
	}
}
