package com.matSoft.controller;

import com.matSoft.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
public class API {

    CustomerService customerService;

    @RequestMapping( name = "/addDataCustomer" , method = RequestMethod.POST)
    public void addData(){
        customerService.addData();
    }
}
