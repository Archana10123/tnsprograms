package com.Archana.Bankingsystem;

public class SavingAccount extends bank {
	private double interestRate;
	public void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void displaySavingDetails() {
		System.out.println("interestRate = " + interestRate + "%");
	}
	public static void main(String[] args) {
		SavingAccount sa=new SavingAccount();
		sa.setAccountHolder("Archana");
		sa.setBalance(25000);
		sa.setInterestRate(5);
		sa.displayAccountDetails();
		sa.displaySavingDetails();
	}

}
