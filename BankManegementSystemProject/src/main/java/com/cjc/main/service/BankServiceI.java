package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.Bank;

public interface BankServiceI {

	Bank saveBank(Bank b);

	

	Bank getBankDeatilsByCustomerId(int customerId);



	List<Bank> getAllBankDetails();



	



	



	Bank updateBankByCustomerId(Bank banks);

}
