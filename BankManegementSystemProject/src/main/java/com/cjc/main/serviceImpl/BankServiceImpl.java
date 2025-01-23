package com.cjc.main.serviceImpl;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Exception.BankDetailNotFountException;

import com.cjc.main.Repositary.BankRepositary;
import com.cjc.main.model.Bank;
import com.cjc.main.service.BankServiceI;

@Service
public class BankServiceImpl implements BankServiceI{
	
 @Autowired private BankRepositary br;
 
 
	@Override
	public Bank saveBank(Bank b) {
		
		return br.save(b);
	}
	
	@Override
	public Bank getBankDeatilsByCustomerId(int customerId) {
		
		Optional<Bank> bank=br.findById(customerId);
		
		if(bank.isPresent()) {
			return bank.get();
		}else {
			
		
			throw new BankDetailNotFountException("bank details not found on this customer Id=" + customerId);
		}
	}

	@Override
	public List<Bank> getAllBankDetails() {
		
		return br.findAll();
	}

	@Override
	public Bank updateBankByCustomerId(Bank banks) {
		Optional<Bank> bank=Optional.empty();
		if(bank.isPresent()) {
			return bank.get();
		}
		else {
		 System.out.println("invalid username or password");
		}
		return banks;
	}

	
		

}
