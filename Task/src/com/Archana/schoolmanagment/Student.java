package com.Archana.schoolmanagment;

public class Student extends Person {
	private int rollNo;
	private String course;
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setCourse(String Course) {
		this.course=course;
	}
	public String course() {
		return course;
	}
	public void displayStudentDetails() {
		System.out.println("RollNo : "+ rollNo);
		System.out.println("Course : "+ course);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Archana");
        s.setAge(22);
        s.setRollNo(101);
        s.setCourse("Computer Science");
        System.out.println("student details");
        s.displayPersonDetails();
        s.displayStudentDetails();
	}

}
