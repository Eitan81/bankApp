package com.ebd.bankEBD;

public class BusinessAccount extends RegularAccount{

	public BusinessAccount() {
		super();
		this.commissionOnDeposit = 1;
		this.commissionOnWithdrawal = 1;
	}
	//deposit(sum) - public, adds “sum” to the balance + COD + bonus
	@Override
	public void deposit(double sum) {
			super.deposit(sum);
		do {
			if (this.commissionOnDeposit == 7)
				this.commissionOnDeposit = 1;
			else
				this.commissionOnDeposit++;
		} while (depositCount % 10 == 0);
	}

	//getBonus() - NOT public, calculates the bonus according to the terms
	protected double getBonus() {
		do {
			return (commissionOnDeposit * 20);
		}while (commissionOnDeposit == 7);
		//return 0;
	}




}
