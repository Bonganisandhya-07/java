package com.example.SpringBoot.SoftDec;

import java.util.List;

import com.example.SpringBoot.model.Software;

public interface SoftwareIntforDef {
	List<Software> fetchAllRecords();
	 Software saveSoftware(Software obj);
	void deleteSoftwarebyId(int id);
	Software getSoftwareById(int id);
		

	}


