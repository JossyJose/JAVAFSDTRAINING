package com.ust.springboot;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpRespository extends MongoRepository<Emp, Long>{
	

	
}
