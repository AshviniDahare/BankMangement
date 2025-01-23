package com.cjc.main.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int customerId;
private String customerName;
private String customerAddress;
private String username;
private String password;
private long mobileNo;
private long AadharNo ;
private String mailId;
@JsonBackReference
@ManyToOne(cascade = CascadeType.ALL)
private Bank bank;
}
