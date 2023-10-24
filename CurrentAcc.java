package com.amdocs.current;
import com.amdocs.bank.BankAcc;

public class CurrentAcc extends BankAcc {
	static {
		System.out.println("CURRENT ACCOUNT IS CREATED");
	}
	
    public CurrentAcc(double Amt) {
    	super(Amt);
    }
	public void withdraw(double Amt) {
		if(Amt<=getbalance()) {
		System.out.println("Rs.200 is deducted on your withdrawl from current account\nAmount to be withdrawn is: "+(Amt+200));
		
		super.withdraw(Amt+200);
		
	}
		else {
			System.out.println("insufficient balance...");
		}
	}
	
	

}
