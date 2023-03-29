package com.divyesh.kaiburrtask.repository;
import com.divyesh.kaiburrtask.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface empRepository extends MongoRepository<Employee, String>{
    @Query("{'name': ?0}")
    Optional<Employee> findByName(String name);
}


