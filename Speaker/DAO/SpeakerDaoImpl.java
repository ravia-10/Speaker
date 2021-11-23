package com.xworkz.Speaker.DAO;

import com.xworkz.Speaker.DTO.SpeakerDTO;

public class SpeakerDaoImpl implements SpeakerDAO{
	
	public SpeakerDaoImpl() {
		System.out.println("inside a SpeakerDaoImpl");
	}

	SpeakerDTO speaker[] = new SpeakerDTO[5];
	int index;
	
	@Override
	public void saveSpeakerDto(SpeakerDTO dto) {
		speaker[index]=dto;
		index++;
		System.out.println("saved successfully");
	}

	@Override
	public void display() {
		
	}

	@Override
	public void displayByBrandName(String brand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateByWatt(int watt, int newPrice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByBrandName(String brand) {
		// TODO Auto-generated method stub
		
	}

	
}
