package com.ust.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppoinmentServiceImpl implements AppoinmentService {
	
	private static final String appoinment = null;
	@Autowired
	AppoinmentRepository apprep;
	
	@Override
	public void register(Appoinment appointment) {
		// TODO Auto-generated method stub
		this.apprep.save(appointment);
	}

	@Override

	public void deleteAppointmentById(String id) {
		this.apprep.deleteById(id);
		
	}
	
	@Override
	public List<Appoinment> getAppointment() {
		return apprep.findAll();
	}
	/*@Override
	public void bookAppoinmentById(String id) {
		// TODO Auto-generated method stub
		this.appRepository.register(appoinment);
	}*/

}
