package com.MiniProjects.logic.EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("select EmployeeType");
		  System.out.println("1.Manager");
		  System.out.println("2.Developer");
		  int EmployeeType=sc.nextInt();
		  System.out.print("Enter ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	       System.out.print("Enter Name: ");
	       String name = sc.nextLine();

		  Employee emp;
		  if(EmployeeType==1) {
			  emp=new Manager(id,name);
		  }else {
			  emp=new Developer(id,name); 
		  }
		  emp.display();
		  emp.DisplayDetails();
		  System.out.println("ID:"+emp.id);
		  System.out.println("Name:"+emp.name);
		  System.out.println("SALARY:"+emp.calculateSalary());
		 
}
}
