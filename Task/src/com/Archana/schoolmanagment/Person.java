package com.Archana.schoolmanagment;

public class Person {
	private String name;
	private int age;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void displayPersonDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Age: " + age);
	}
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Archana");
		p.setAge(22);
		p.displayPersonDetails();
	}

}
