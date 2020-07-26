package com.hari.virtualq.controller;

import com.hari.virtualq.domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VirtualQueueController {

    @GetMapping("/rest/employee/get/{id}")
    public Customer getEmployeeByID(@PathVariable("id") String id) {
        //Customer customer = new Customer();
        return Customer.builder()
                .customerId(id)
                .customerName("Hari")
                .build();

    }
}
