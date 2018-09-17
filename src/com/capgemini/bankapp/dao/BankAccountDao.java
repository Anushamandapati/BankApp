package com.capgemini.bankapp.dao;

public interface BankAccountDao 
{
	
		//public BankAccount getBalance(long accountId);
		public double getBalance(long accountId);
		public boolean updateBalance(long accountId, double newBalance);
}
