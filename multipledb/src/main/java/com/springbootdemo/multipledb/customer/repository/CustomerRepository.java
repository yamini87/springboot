package com.springbootdemo.multipledb.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootdemo.multipledb.model.customer.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
