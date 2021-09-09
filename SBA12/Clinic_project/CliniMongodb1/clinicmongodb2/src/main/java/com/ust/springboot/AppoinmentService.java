package com.ust.springboot;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface AppoinmentService {

	void register(Appoinment appoinment);
	void deleteAppointmentById(String id);
	List <Appoinment> getAppointment();

}
