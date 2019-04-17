package com.ashiqur.rahman.Stream_Task;

public class Employee {

    private String name;
    private String id;
    private double salary;
    private Gender gender;
	public Employee(String name, String id, double salary, Gender gender) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", gender=" + gender + "]";
	}
	
 
}