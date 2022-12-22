package com.example.SpringBoot.SoftImp;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringBoot.Interface.SoftwareInt;
import com.example.SpringBoot.SoftDec.SoftwareIntforDef;
import com.example.SpringBoot.model.Software;

@Service


public class SoftwareImpforInterface implements  SoftwareIntforDef{

	private SoftwareInt software;
public SoftwareImpforInterface(SoftwareInt software) {
	
		this.software = software;
	}
@Override
public List<Software> fetchAllRecords() {
	
	return software.findAll();
}
@Override
public Software saveSoftware(Software obj) {
		return software.save(obj);
}
public void deleteSoftwarebyId(int id) {
	 software.deleteById(id);
}
public Software getSoftwareById(int id) {
	return	software.findById(id).get();
	}
}







