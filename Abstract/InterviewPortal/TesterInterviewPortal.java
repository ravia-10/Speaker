package com.xworkz.Abstract.InterviewPortal;

public class TesterInterviewPortal {

	public static void main(String[] args) {
		InfosysOnlineInterviewPortal infosys = new InfosysOnlineInterviewPortal();
		
		infosys.login("ravi", "ravi1020");
		infosys.interviewSchedule(12334);
		infosys.prepareQuestionset();
		infosys.takeTest();
		infosys.viewResult(12334);
		// WiproOnlineInterviewPortal wipro = new WiproOnlineInterviewPortal();
	}

}
