package com.xworkz.Speaker.DAO;

import com.xworkz.Speaker.DTO.SpeakerDTO;

public interface SpeakerDAO {

	public void saveSpeakerDto(SpeakerDTO dto);
	public void display();
	public void displayByBrandName(String brand);
	public void updateByWatt(int watt, int newPrice);
	public void deleteByBrandName(String brand);
}
