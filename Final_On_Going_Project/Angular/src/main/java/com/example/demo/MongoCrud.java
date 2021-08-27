package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoCrud extends MongoRepository<Emp, Object> {

}
