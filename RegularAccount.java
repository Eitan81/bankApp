package com.ebd.bankEBD;

import java.util.Random;

public class RegularAccount {
	private final int clientId;
			
	private double balance;
	private String action = "Accont Ballance";
	
	protected double commissionOnDeposit;
	protected double commissionOnWithdrawal;
	protected int depositCount;
	
	
	
	public RegularAccount() {
		super();

		this.commissionOnDeposit = 1;
		this.commissionOnWithdrawal = 3;
		depositCount = 0;
		Random regularAccount = new Random();
		clientId = regularAccount.nextInt(3000000);
				}
	
	public int getClientId() {
		return clientId;
	}
	public double getBalance() {
		return balance;
	}
	//deposit(sum) - public, adds “sum” to the balance + COD + bonus
	public void deposit(double sum) {
		action = "Deposit " + sum + " ";
		balance = balance + sum + commissionOnDeposit + getBonus();
		depositCount++;
	}
	//withdraw(sum) - public, adds “sum” to the balance – COW
	public void withdraw(double sum) {
		action = "withdraw " + sum + " ";
		balance = balance + commissionOnDeposit ;
	}
	//getBonus() - NOT public, calculates the bonus according to the terms
	protected double getBonus() {
		return 0;
	}
	@Override
	public String toString() {
		return "RegularAccount [clientId=" + clientId + ", balance=" + balance + ", action=" + action
				+ ", commissionOnDeposit=" + commissionOnDeposit + ", commissionOnWithdrawal=" + commissionOnWithdrawal
				+ ", depositCount=" + depositCount + "]";
	}
	
	
		
	

}
