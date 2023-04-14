package com.example.demo.entity;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;



public class Customer {
    private int customerId;
    private String customerName;
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime dueTime;
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime joinTime;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDateTime getDueTime() {
        return dueTime;
    }

    public void setDueTime(LocalDateTime dueTime) {
        this.dueTime = dueTime;
    }

    public LocalDateTime getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(LocalDateTime joinTime) {
        this.joinTime = joinTime;
    }

    public Customer(int customerId, String customerName, LocalDateTime dueTime, LocalDateTime joinTime) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.dueTime = dueTime;
        this.joinTime = joinTime;
    }

    public Customer() {
    }
}
