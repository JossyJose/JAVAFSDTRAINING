package com.ust.springboot;

import java.util.List;



public interface AppoinmentService {
	
	List <Appoinment> getAppointment();
	void register(Appoinment appoinment);
	void deleteAppointmentById(String id);
	

}
