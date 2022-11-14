package com.educode.springdatajpacourse.repository;

import com.educode.springdatajpacourse.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    List<Customer> findCustomerByName(String name);


    Customer findCustomerByEmail(String name);





}
