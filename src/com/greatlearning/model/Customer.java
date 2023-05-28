package com.greatlearning.model;

public class Customer {
	
		private String accNo;
		private String password;
		
		public Customer() {}
		public Customer(String accNo, String password) {
			this.accNo = accNo;
			this.password = password;
		}
		public String getAccNo() {
			return accNo;
		}
		public void setAccNo(String accNo) {
			this.accNo = accNo;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public boolean login(String accNumber,String password)
		{
			if(this.accNo.equals(accNumber) && this.password.equals(password))
				return true;
			else
				return false;
		}
		
}
