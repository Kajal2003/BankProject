package com.capgemini.service;

 
import Exceptions.InsufficientBalanceException;
import Exceptions.InsufficentOpeningAmountException;
import Exceptions.InvalidAccountNumberException;

 
 public interface Bank {
	  
	 String createAccount(int accountNumber,int amount) throws InsuffcientOpeningAmountException;
		
	  int withdrawAmount(int accountNumber,int amount) throws InvalidAccountNumberException, InsufficientBalanceException;
		
	   int depositAmount(int accountNumber,int amount) throws InvalidAccountNumberException;
		
	    int[] fundTransfer(int accountNumber1,int accountNumber2,int amount) throws InvalidAccountNumberException,InsufficientBalanceException;
	}


