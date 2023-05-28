package com.greatlearning.service;

public interface BankingServices {
	double checkBalance();
	void Deposit(double amount);
	void Withdrawal(double amount);
	boolean Transfer();
}
