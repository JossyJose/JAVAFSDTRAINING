package com.ust.springboot;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import org.springframework.stereotype.Repository;
@EnableMongoRepositories
@Repository
public interface AppoinmentRepository extends MongoRepository<Appoinment, String>{

	

}