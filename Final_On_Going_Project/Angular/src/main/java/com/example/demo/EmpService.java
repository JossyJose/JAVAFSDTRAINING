package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	@Autowired
	MongoRepository repo;
	/*public List<Emp> getAllEmp()  
	{  
	List<Emp> empp = new ArrayList<Emp>();  
	for(Emp emp1:(Emp) repo.findAll().toArray()) {
		empp.add(emp1);
	}
	return empp;  
	} */
	
	public Emp getEmpById(int id)   
	{  
	return (Emp) repo.findById(id).get();  
	}
	public void saveOrUpdate(Emp emp)   
	{  
	repo.save(emp);  
	}  
	
	//updating a record  
	public void update(Emp emp, int id)   
	{  
	repo.save(emp);  
	}

	

}
