package com.xworkz.Speaker.Service;

import com.xworkz.Speaker.DAO.SpeakerDaoImpl;
import com.xworkz.Speaker.DTO.SpeakerDTO;

public class SpeakerDtoServiceImpl implements SpeakersDtoService {

	boolean flag = false;
	SpeakerDaoImpl dao = new SpeakerDaoImpl();

	public SpeakerDtoServiceImpl() {
		System.out.println("inside a service impl");
	}

	@Override
	public boolean validateSaveDto(SpeakerDTO dto) {

		if (dto.getPrice() < 2000) {
			flag = true;
		}

		if (dto.getWatt() < 15) {
			flag = true;
		}

		if (flag == false) {
			dao.saveSpeakerDto(dto);
		} else {
			System.out.println("ALert!!!!!!  price should be greater than 2000 and also watt should be greater 15 check the requriments");
		}
		return flag;

	}
}
