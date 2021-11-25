package com.xworkz.Abstract.InterviewPortal;

public abstract class InterviewPortal {

	public void login(String username, String password) {
		System.out.println("login successfully");
	}

	public void logout() {
		System.out.println("logout successfully");
	}

	public void viewResult(int rollNumber) {
		System.out.println("scored 87");
	}

	public void interviewSchedule(int rollNumber) {
		System.out.println("view schedule");
	}

	abstract public void prepareQuestionset();

	abstract public void takeTest();
}
