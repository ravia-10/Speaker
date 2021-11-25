package com.xworkz.Abstract.CollegeRegistrationApp;

public abstract class CollegeRegistrationApp {

	public void login(String username, String password) {
		System.out.println("login successfully");

	}

	public void logout() {
		System.out.println("logout suceessfull");
	}

	abstract public void collegeName();

	abstract public void BranchName();

	abstract public void feesStructure();
}
