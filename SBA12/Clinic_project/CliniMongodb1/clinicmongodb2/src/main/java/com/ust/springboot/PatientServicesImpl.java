package com.ust.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component

public class PatientServicesImpl implements PatientServices {
    
	@Autowired
	PatientsRepository patientrep;
	@Override
	public List<Patients> getPatients() {
		// TODO Auto-generated method stub
	
		return patientrep.findAll();
	}

	@Override
	public void savePatients(Patients patients) {
		// TODO Auto-generated method stub
		this.patientrep.save(patients);
		
	}
	
    
	@Override
	public Patients getPatientsById(String id) {
		// TODO Auto-generated method stub
		Optional<Patients> optional = patientrep.findById(id);
		Patients patients = null;
		if (optional.isPresent()) {
			patients = optional.get();
		} else {
			throw new RuntimeException(" Patients not found for id :: " + id);
		}
		return patients;
	}

	@Override
	public void deletePatientsById(String id) {
		// TODO Auto-generated method stub
		this.patientrep.deleteById(id);
	}


}
