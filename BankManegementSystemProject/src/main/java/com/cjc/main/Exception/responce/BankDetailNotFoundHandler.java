package com.cjc.main.Exception.responce;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cjc.main.Exception.BankDetailNotFountException;
import com.cjc.main.dto.ErrorResponce;

@RestControllerAdvice
public class BankDetailNotFoundHandler {

	@ExceptionHandler(BankDetailNotFountException.class)
	public ResponseEntity<ErrorResponce> handleBankDetailNotFoundException(BankDetailNotFountException be){
		
		ErrorResponce responce= new ErrorResponce(be.getMessage(), be.getClass().getName(), new Date(), 404);
		return  new ResponseEntity<ErrorResponce>(responce,HttpStatus.OK);
		
		
	}
	
}
