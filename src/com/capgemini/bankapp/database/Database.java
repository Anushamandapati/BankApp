package com.capgemini.bankapp.database;

import java.time.LocalDate;
import java.util.HashSet;

import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.model.Customer;

public class Database 
{

	public Database()
	{
		super();
	}
	static HashSet<BankAccount> bankData = new HashSet<>();
	static HashSet<Customer> customerData = new HashSet<>();

	static
	{
		BankAccount b1 = new BankAccount(2024, 100, "SAVINGS");
		BankAccount b2 = new BankAccount(2025, 100, "CURRENT");
		BankAccount b3 = new BankAccount(20239027785L, 100, "SAVINGS");
		BankAccount b4 = new BankAccount(20239027786L, 100, "CURRENT");
		BankAccount b5 = new BankAccount(20239027787L, 100, "SAVINGS");
		BankAccount b6 = new BankAccount(20239027788L, 100, "CURRENT");
		BankAccount b7 = new BankAccount(20239027789L, 100, "SAVINGS");
	
		bankData.add(b1);
		bankData.add(b2);
		bankData.add(b3);
		bankData.add(b4);
		bankData.add(b5);
		bankData.add(b6);
		bankData.add(b7);
		customerData.add(new Customer("Anu", 1234, "anu", "anusha@gmail.com", "Bhimavaram", LocalDate.parse("1996-03-28"),b1));
		customerData.add(new Customer("Keerthy", 4567, "keerthy", "keerthy@gmail.com", "Mysore", LocalDate.parse("1996-09-18"),b2));
		customerData.add(new Customer("Srilu", 9874, "srilu", "srilu@gmail.com", "bengaluru", LocalDate.parse("1996-12-07"),b3));
		customerData.add(new Customer("Devika", 9999, "devi", "devika@gmail.com", "hyderabad", LocalDate.parse("1996-04-17"),b4));
		customerData.add(new Customer("malyka", 9990, "malyka", "malyka@gmail.com", "delhi", LocalDate.parse("1996-08-25"),b5));
		customerData.add(new Customer("poudel", 8888, "priyanka", "poudel28@gmail.com", "puna", LocalDate.parse("1996-09-25"),b6));
		customerData.add(new Customer("switty", 4444, "switty", "switty@gmail.com", "coorg", LocalDate.parse("1996-10-25"),b7));
	}
	public static HashSet<BankAccount> getAllBankData()
	{
		return bankData;
	}
	public static HashSet<Customer> getAllCustomerData()
	{
		return customerData;
	}
	public static void setAllBankData(HashSet<BankAccount> bankDataUpdated)
	{
		bankData=bankDataUpdated;
	}
	
	public static void setAllCustomerData(HashSet<Customer> customerDataUpdated) 
	{
		customerData=customerDataUpdated;
	}

}
