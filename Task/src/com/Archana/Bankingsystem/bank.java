package com.Archana.Bankingsystem;

public class bank {
	 private String accountHolder;
	 private double balance;
	 public void setAccountHolder(String accountHolder) {
		 this.accountHolder=accountHolder;
	 }
	 public String getAccountHolder() {
		 return accountHolder;
	 }
	 public void setBalance(double balance) {
		 this.balance=balance;
	 }
	 public double getBalance() {
		 return balance;
	 }
	 public void displayAccountDetails() {
		 System.out.println("AccountHolder = " + accountHolder);
		 System.out.println("Balance = " + balance);
	 }
	public static void main(String[] args) {
		bank b=new bank();
		b.setAccountHolder("Archana");
		b.setBalance(25000);
		b.displayAccountDetails();

	}

}
