package com.MiniProjects.logic.EmployeeManagementSystem;
import java.util.Scanner;
abstract class Employee {
 int id;
 String name;
 Employee(int id,
 String name){
	 this.id=id;
	 this.name=name;
  }
 void display() {
	 System.out.println(id);
	 System.out.println(name);
	 
 }
 abstract void DisplayDetails();

 abstract int calculateSalary();
}
