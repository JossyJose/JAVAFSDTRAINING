package com.ust.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class ClinicServiceimpl implements ClinicServices{
    @Autowired
    ClinicRespository clinicrep;
	@Override
	public List<Med> getMedicine() {
		// TODO Auto-generated method stub
		return clinicrep.findAll();
	}

	@Override
	public void saveMedicine(Med medicine) {
		// TODO Auto-generated method stub
		this.clinicrep.save(medicine);
		
	}

	@Override
	public Med getMedicineById(String id) {
		// TODO Auto-generated method stub
		Optional<Med> optional = clinicrep.findById(id);
		Med medicine = null;
		if (optional.isPresent()) {
			medicine = optional.get();
		} else {
			throw new RuntimeException(" Medicine not found for id :: " + id);
		}
		return medicine;
	}

	@Override
	public void deleteMedicineById(String id) {
		// TODO Auto-generated method stub
		this.clinicrep.deleteById(id);
	}
	
	
}
