package com.example.fintech_app.fintech_application.practice.repository;

import com.example.fintech_app.fintech_application.practice.model.CustomerTest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Querying
 */
public interface CustomerTestRepository extends CrudRepository<CustomerTest, Long> {
    /* dapat parehas ung name ng findby... mo sa  property. hindi pwedeing iba*/
    List<CustomerTest> findBylastname(String lastname);
    List<CustomerTest> findAll();
    CustomerTest findById(long id);
}
