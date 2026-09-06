package com.Archana.onlinshopping;

public class Laptop extends Electronics {
	private int ram;
	public void setRam(int ram) {
		this.ram=ram;
	}
	public int getRam() {
		return ram;
	}
	public void displayRamDetails() {
		System.out.println("Ram : " + ram + "GB");
	}
	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.setProductName("Laptop");
		l.setPrice(56000);
		l.setBrand("hp");
		l.setRam(16);
		System.out.println("Laptop Details");
		l.displayProductDetails();
		l.displayBrandDetails();
		l.displayRamDetails();
		Clothing clothing = new Clothing();
        clothing.setProductName("T-Shirt");
        clothing.setPrice(250);
        clothing.setSize("M");
        System.out.println();
        System.out.println("Clothing Details");
        clothing.displayProductDetails();
        clothing.displaySizeDetails();

	}

}
