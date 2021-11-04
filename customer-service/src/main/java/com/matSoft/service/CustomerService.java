package com.matSoft.service;

import com.matSoft.dto.CustomerRepository;
import com.matSoft.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void addData(){
        customerRepository.save(new Customer(null,"Toure","lallana2re@otmail.com"));
    }
}
