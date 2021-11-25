package com.xworkz.Abstract.CollegeRegistrationApp;

public class TesterColllegeApp {

	public static void main(String[] args) {
		CITCollege cit = new CITCollege();
		cit.login("ravi", "cit9844");
		cit.collegeName();
		cit.BranchName();
		cit.feesStructure();
		cit.logout();
	}

}
