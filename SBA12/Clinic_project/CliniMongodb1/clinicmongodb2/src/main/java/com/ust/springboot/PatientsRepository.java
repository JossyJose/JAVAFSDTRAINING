package com.ust.springboot;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;
@EnableMongoRepositories
@Component
public interface PatientsRepository extends MongoRepository<Patients, String>{

}
