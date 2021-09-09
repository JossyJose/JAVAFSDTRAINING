package com.ust.springboot;

import java.util.List;


public interface ClinicServices {

	List <Med> getMedicine();
	void saveMedicine(Med medicine);
	Med getMedicineById(String id);
	void deleteMedicineById(String id);
}
