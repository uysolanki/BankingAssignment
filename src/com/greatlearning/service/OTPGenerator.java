package com.greatlearning.service;

public class OTPGenerator {
	
	public int generateOTP()
	{
		return((int)(Math.random() * 8000)+1000);
	}
}
