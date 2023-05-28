package com.greatlearning.service;

import java.util.Scanner;

public class IndianBankImpl implements BankingServices {

	double balance=1000;
	@Override
	public double checkBalance() {
		return balance;
	}

	@Override
	public void Deposit(double amount) {
		if(amount>0)
		{
				balance+=amount;
				System.out.println("Updated Balanace is "+balance);
		}
		else
		{
			System.out.println("Please enter Valid Amount");
		}
	}

	@Override
	public void Withdrawal(double amount) {
		if(amount<=balance)
		{
			balance-=amount;
			System.out.println("Updated Balanace is "+balance);
		}
		else
		{
			System.out.println("InSufficient Funds");
		}
	}

	@Override
	public boolean Transfer() {
		Scanner sc=new Scanner(System.in);
		OTPGenerator otpGen = new OTPGenerator();
		
		int smsOTP=otpGen.generateOTP();
		System.out.println("OTP RECIVED VIA SMS "+ smsOTP);
		
		System.out.println("Enter OTP");
		int enteredOTP=sc.nextInt();
		
		if(smsOTP==enteredOTP)
		{
			System.out.println("Enter Amount to Transfer");
			double tAmt=sc.nextDouble();
			
			if(tAmt<=balance)
			{
				balance-=tAmt;
				System.out.println("Updated Balanace is "+balance);
			}
			return true;
		}
		else
		{
			System.out.println("OTP not Matching");
			return false;
		}
	}

}
