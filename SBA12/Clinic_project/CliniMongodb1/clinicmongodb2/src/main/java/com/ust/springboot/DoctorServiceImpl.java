package com.ust.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DoctorServiceImpl implements DoctorServices{
	
	@Autowired
	 DoctorRepository docrepo;
	@Override
	public List<Doctor> getDoctors() {
		return docrepo.findAll();
	}
	@Override
	public void saveDoctor(Doctor doc) {
		this.docrepo.save(doc);
		
	}
	@Override
	public Doctor getDoctorById(String id) {
		
		Optional<Doctor> optional = docrepo.findById(id);
		Doctor doc = null;
		if (optional.isPresent()) {
			doc = optional.get();
		} else {
			throw new RuntimeException(" Doctor not found for id :: " + id);
		}
		return doc;
	}
	@Override

	public void deleteDoctorById(String id) {
		this.docrepo.deleteById(id);
		
	}
	 

	

}
