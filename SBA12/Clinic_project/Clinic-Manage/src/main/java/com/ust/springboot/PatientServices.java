package com.ust.springboot;
import java.util.List;

public interface PatientServices {
	List <Patients> getPatients();
	void savePatients(Patients patients);
	Patients getPatientsById(String id);
	void deletePatientsById(String id);

}
