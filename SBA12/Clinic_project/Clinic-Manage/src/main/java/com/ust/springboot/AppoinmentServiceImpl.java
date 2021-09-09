package com.ust.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AppoinmentServiceImpl implements AppoinmentService {
	
	
	@Autowired
	AppoinmentRepository apprep;
	
	@Override
	public void register(Appoinment appointment) {
		// TODO Auto-generated method stub
		this.apprep.save(appointment);
	}

	@Override
	public List<Appoinment> getAppointment() {
		return apprep.findAll();
	}
	
	@Override

	public void deleteAppointmentById(String id) {
		this.apprep.deleteById(id);
		
	}
	
	

}
