package com.Archana.Bankingsystem;

public class StudentSavingsAccount extends SavingAccount {
	 private double discount;
	 public void setDiscount(double discount) {
		 this.discount=discount;
	 }
	 public double getDiscount() {
		 return discount;
	 }
	 public void displayStudentSavingsAccount() {
		 System.out.println("Student Discount: " + discount + "%");
	 }
	public static void main(String[] args) {
		StudentSavingsAccount ssa=new StudentSavingsAccount();
		ssa.setAccountHolder("Archana");
		ssa.setBalance(25000);
		ssa.setInterestRate(5);
		ssa.setDiscount(10);
		 System.out.println("Banking System");
		ssa.displayAccountDetails();
		ssa.displaySavingDetails();
        ssa.displayStudentSavingsAccount();
	}

}
