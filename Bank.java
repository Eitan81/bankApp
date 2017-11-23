package com.ebd.bankEBD;

public class Bank {
	
	public static void main(String[] args) {
		
		RegularAccount regular = new RegularAccount();
		System.out.println("Regular Account");
		System.out.println(regular);
		regular.withdraw(500);
		System.out.println(regular);
		regular.deposit(600);
		System.out.println(regular);
		
		BusinessAccount business = new BusinessAccount();
		System.out.println("Business Account");
		for (int i=0 ; i < 140 ; i++) {
			business.deposit(10000);
			System.out.println(business);
			business.withdraw(8000);
			System.out.println(business);
			
		}
		
		StockAccount stock = new StockAccount();
		System.out.println("Stock Account");
		System.out.println(stock);
		stock.deposit(10000);
		System.out.println(stock);
		stock.deposit(15000);
		System.out.println(stock);
		stock.withdraw(12000);
		System.out.println(stock);
		stock.withdraw(5000);
		System.out.println(stock);
		
	}
	 

}
