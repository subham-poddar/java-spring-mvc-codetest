package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/sortCustomers")
    public ResponseEntity<List<Customer>> sortCustomers(@RequestBody List<Customer> customer){
        List<Customer> sortedCustomers = customerService.sortCustomers(customer);
        return new ResponseEntity<>(sortedCustomers, HttpStatus.OK);

    }

}
