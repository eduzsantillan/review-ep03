package com.educode.springdatajpacourse.controller;

import com.educode.springdatajpacourse.entity.Customer;
import com.educode.springdatajpacourse.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping({"/hello","/","/home"})
    public String helloController(){
        return "Hola Mundo";
    }

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @GetMapping("/getall")
    public List<Customer> getall(){
        return customerService.getall();
    }

    @GetMapping("/getbyname")
    public List<Customer> findByName(@RequestParam String name){
        return customerService.findByName(name);
    }

    @GetMapping("/getbyemail")
    public Customer findByEmail(@RequestParam String email){
        return customerService.findByEmail(email);
    }

    @PostMapping("/updatecustomer")
    public void updateCustomer(@RequestParam String email,
                               @RequestBody Customer customer){
        customerService.updateCustomer(customer,email);
    }


}
