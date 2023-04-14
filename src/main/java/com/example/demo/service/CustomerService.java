package com.example.demo.service;

import com.example.demo.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class CustomerService {

    public List<Customer> sortCustomers(List<Customer> customer) {

        Collections.sort(customer, Comparator.comparing(Customer::getDueTime));
        return customer;
    }
}
