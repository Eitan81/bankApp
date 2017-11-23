package com.ebd.bankEBD;

import java.util.Random;

public class StockAccount extends RegularAccount{

	public StockAccount() {
		super();
		commissionOnDeposit = 0;
		commissionOnWithdrawal = 0;
	}

	@Override
	public void deposit(double sum) {
		super.deposit(sum);
		Random cod = new Random();
		commissionOnDeposit = cod.nextInt(6);
		
	}

	@Override
	public void withdraw(double sum) {
		super.withdraw(sum);
		Random cow = new Random();
		commissionOnDeposit = cow.nextInt(6);
	}

	@Override
	protected double getBonus() {
		return (commissionOnDeposit - commissionOnWithdrawal);
	}
	
	

}
