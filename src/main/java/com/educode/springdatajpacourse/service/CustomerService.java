package com.educode.springdatajpacourse.service;

import com.educode.springdatajpacourse.entity.Customer;
import com.educode.springdatajpacourse.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public void addCustomer(Customer customer ){

        customerRepository.save(customer);

    }

    public List<Customer> getall(){
        return customerRepository.findAll();
    }


    public List<Customer> findByName (String name){
        return customerRepository.findCustomerByName(name);
    }


    public Customer findByEmail(String email){
        return customerRepository.findCustomerByEmail(email);
    }


    @Transactional
    public void updateCustomer(Customer customer,String email){

        Customer customerToUpdate = customerRepository.findCustomerByEmail(email);

        if(customerToUpdate!= null){
            customerToUpdate.setEmail(customer.getEmail()!=null?
                    customer.getEmail(): customerToUpdate.getEmail());
            customerToUpdate.setName(customer.getName()!=null?
                    customer.getName() : customerToUpdate.getName());
            customerToUpdate.setLastname(customer.getLastname()!=null?
                    customer.getLastname() : customerToUpdate.getLastname());
            //customerRepository.save(customerToUpdate);
        }
    }



}
