package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.service.IndianBankImpl;

public class DriverApp {
		public static void main(String[] args) {
			
			Customer customer=new Customer("18","Virat123");
			IndianBankImpl bank=new IndianBankImpl();
			
			int choice;
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter Account Number");
			String accNo=sc.next();
			
			System.out.println("Please enter Account password");
			String accPw=sc.next();
			
			if(customer.login(accNo, accPw))
			{
				System.out.println("Login Successfull");
			do{
		
				System.out.println("**** BANKING MENU ****");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Transfer Funds");
				System.out.println("4. Check Balance");
				System.out.println("5. Exit");
				
				System.out.println("Please Enter Your Choice");
				choice=sc.nextInt();
					switch(choice)
					{
					case 1 :
						System.out.println("Please Enter Amount to Deposit");
						double dAmt=sc.nextDouble();
						bank.Deposit(dAmt);
						break;
					case 2 :
						System.out.println("Please Enter Amount to Withdraw");
						double wAmt=sc.nextDouble();
						bank.Withdrawal(wAmt);
						break;
					case 3 :
						String t=bank.Transfer()?"Transaction Successful":"Transaction NOT Successful";
						System.out.println(t);
						break;
					case 4: 
						double bal=bank.checkBalance();
						System.out.println("Current balance is "+bal);
						break;
					case 5 :
						System.exit(0);
					default:
						System.out.println("Please Enter Valid Choice");	
					}
				}while(choice!=5);
			
			
			}
			else
			{
				System.out.println("Please Enter Valid Credentials");
			}
			
		}
}
