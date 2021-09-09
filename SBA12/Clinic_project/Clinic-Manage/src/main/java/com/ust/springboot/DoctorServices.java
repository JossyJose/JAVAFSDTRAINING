package com.ust.springboot;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface DoctorServices {

List <Doctor> getDoctors();
	
	//void saveDoctor(Doctor doc);
	Doctor getDoctorById(String id);
	void deleteDoctorById(String id);

	void saveDoctor(Doctor doc);
		
}

