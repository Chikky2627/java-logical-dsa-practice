package com.MiniProjects.logic.EmployeeManagementSystem;

public class Manager extends Employee {
	Manager(int id,String name){
		super(id,name);
	}
	void DisplayDetails() {
		System.out.println("Manager Details:");
	}
	int calculateSalary() {
		return 50000;
	}
	
}
class Developer extends Employee {
	Developer(int id,String name){
		super(id,name);
	}
	void DisplayDetails() {
		System.out.println("Developer Details:");
	}
	int calculateSalary() {
		return 50000;
	}
}
