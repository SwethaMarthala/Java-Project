package com.amdocs.bank;

import com.amdocs.current.CurrentAcc;
import com.amdocs.savings.SavingsAcc;

public class BankAcc {
	private  double Bankbalance;
	static {
		System.out.println("BANK ACCOUNT IS CREATED");
		
	}
	public BankAcc(double Balance) {
		this.Bankbalance=Balance;
		System.out.println("Account is Created with initial balance of :" +Balance);
		
	}
	
	
	public void deposit(double Amount)
	{
		System.out.println("Amount credited is: "+Amount);
		this.Bankbalance=this.Bankbalance+Amount;
	
		System.out.println("After Depositing your Balance :"+this.Bankbalance);
		
	}
	public void withdraw(double Amount) {
		if(this.Bankbalance>=Amount) {
			this.Bankbalance-=Amount;
			System.out.println("After Withdrawing your Balance is: "+this.Bankbalance);
			
		}
		else {
			System.out.println("Your Bankbalance is insufficient");
		}
		
		
		
	}
	public double getbalance() {
		return this.Bankbalance;
	}
	public void checkBalance() {
		System.out.println("BALANCE is:"+this.Bankbalance);
	}
	public void transfer(double amt,BankAcc b1) {
		if(amt<=this.Bankbalance) {
			this.withdraw(amt);
			b1.deposit(amt);
			System.out.println("Amount transferred .");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}

}
