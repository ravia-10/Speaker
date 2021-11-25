package com.xworkz.Abstract.InterviewPortal;

public class WiproOnlineInterviewPortal extends InterviewPortal {

	public WiproOnlineInterviewPortal() {
		System.out.println("welcome to wipro online portal");
	}

	@Override
	public void prepareQuestionset() {
		System.out.println("program question");
	}

	@Override
	public void takeTest() {
		System.out.println("write a program choose any language");
	}

}
