package com.xworkz.Speaker;

import com.xworkz.Speaker.DTO.SpeakerDTO;
import com.xworkz.Speaker.Service.SpeakerDtoServiceImpl;

public class TesterSpeaker {

	public static void main(String[] args) {
		SpeakerDtoServiceImpl service = new SpeakerDtoServiceImpl();
		SpeakerDTO  jbl = new SpeakerDTO("jbl","black",1000,26);
		//price >2000 only save
		//watt > 15 only save
		 service.validateSaveDto(jbl);
	}

}
