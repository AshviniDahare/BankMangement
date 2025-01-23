package com.cjc.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Bank;
import com.cjc.main.service.BankServiceI;

@RestController
public class BankController {
	@Autowired
	private BankServiceI bankservicei;

	@PostMapping("/saveBank")
	public ResponseEntity<Bank> saveBankdata(@RequestBody Bank b) {
		Bank bank = bankservicei.saveBank(b);

		return new ResponseEntity<Bank>(bank, HttpStatus.CREATED);

	}

	@GetMapping("/getDetailByCustomerId/{customerId}")
	public ResponseEntity<Bank> getBankDeatilsByCustomerId(@PathVariable int customerId) {

		Bank bank = bankservicei.getBankDeatilsByCustomerId(customerId);

		return new ResponseEntity<Bank>(bank, HttpStatus.OK);

	}

	@GetMapping("/getAllbankDetail")
	public ResponseEntity<List<Bank>> getAllBankDetails() {
		List<Bank> list = bankservicei.getAllBankDetails();
		return new ResponseEntity<List<Bank>>(list, HttpStatus.OK);

	}
	@PutMapping("/updateBycustomerId/{customerId}")
	public ResponseEntity<Bank> updateBank(@PathVariable int customerId,@RequestBody Bank banks){
		Bank bank=bankservicei.updateBankByCustomerId(banks);
		
		return new ResponseEntity<Bank>(bank, HttpStatus.OK);
		
	}
}
