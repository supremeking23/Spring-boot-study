package com.example.fintech_app.fintech_application.practice;

import com.example.fintech_app.fintech_application.practice.model.CustomerTest;
import com.example.fintech_app.fintech_application.practice.repository.CustomerTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/customers")
public class CustomerTestController {
    @Autowired
    CustomerTestRepository customerTestRepository;

    record CustomerTestRequest(String firstname, String lastname){ }

    @GetMapping(path = "/all")
    public List<CustomerTest> fetchAllCustomer(){
        return customerTestRepository.findAll();
    }

    @GetMapping(path = "/lastname")
    public List<CustomerTest> fetchByLastname(@RequestBody CustomerTestRequest customer){
        return customerTestRepository.findBylastname(customer.lastname);
    }


    @PostMapping(path = "/add")
    public ResponseEntity<CustomerTest> saveCustomer(@RequestBody CustomerTestRequest customer){
        CustomerTest cust = new CustomerTest(customer.firstname, customer.lastname);
        return new ResponseEntity(customerTestRepository.save(cust), HttpStatus.CREATED);
    }

}
