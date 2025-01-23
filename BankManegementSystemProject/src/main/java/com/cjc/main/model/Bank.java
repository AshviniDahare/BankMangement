package com.cjc.main.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public class Bank {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int bankId;
private String bankName;
private String bankAddress;
private String branchName;
@JsonManagedReference
@OneToMany(cascade = CascadeType.ALL)
private List<Customer> customer;
}
