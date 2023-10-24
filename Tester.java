package com.amdocs.savings;

import com.amdocs.savings.SavingsAcc;
import com.amdocs.bank.BankAcc;
import com.amdocs.current.CurrentAcc;

public class Tester {
	
	public  static void main(String[] args) {
		BankAcc b1=new BankAcc(3000);
		b1.deposit(2000);
		b1.checkBalance();
		SavingsAcc s1=new SavingsAcc(5000);
		s1.deposit(300);
		
		CurrentAcc c1=new CurrentAcc(4000);
		c1.withdraw(2000);
		s1.checkBalance();
		c1.transfer(500,s1);
		s1.transfer(1000, c1);
		
		
	}

}
