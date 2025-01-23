package com.cjc.main.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.model.Customer;

public interface CustomerRepositary extends JpaRepository<Customer, Integer>{

}
