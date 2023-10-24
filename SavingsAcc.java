package com.amdocs.savings;
import com.amdocs.bank.BankAcc;


public class SavingsAcc extends BankAcc {

	private double interest;
	public SavingsAcc(double Amt) {
		super(Amt);
			
	}
	static {
		System.out.println("SAVINGS ACCOUNT CREATED");
	}
	public void deposit(double Amt) {
		interest=Amt*0.03;
		System.out.println("you got 3% interest on your deposit from Savings Account:"+interest);
		super.deposit(Amt+interest);
			
		
	}
	

}
