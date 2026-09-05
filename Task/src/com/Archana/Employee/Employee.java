package com.Archana.Employee;

public class Employee {
	public String name;
	private int employee;
	protected double salary;
	public void dispaly() {
		System.out.println(name);
		System.out.println(employee);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.name="Archana";
		emp.employee=123;
		emp.salary=20000;
		emp.dispaly();
	}
}
