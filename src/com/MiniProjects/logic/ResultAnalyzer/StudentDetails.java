package com.MiniProjects.logic.ResultAnalyzer;
import java.util.Scanner;
public class StudentDetails {
	private String name;
	private static int Sub1;
	private int sub2;
	private int sub3;
  
  StudentDetails (String name,int sub1,int sub2,int sub3){
	  this.name=name;
	  this.Sub1=sub1;
	  this.sub2=sub2;
	  this.sub3=sub3;
	  
  }
  public String getName() {
	  return name;
	  
  }
  public int getSub1() {
	  return Sub1;
	  
  }
  public void setSub1(int sub1) {
	  this.Sub1=Sub1;
  }
  public int getSub2() {
	  return Sub1;
	  
  }
  public int getSub3() {
	  return Sub1;
	  
  }
  public boolean isPassed() {
	  return Sub1>=35&&sub2>=35&&sub3>=35;
  }
  public int calculateAverage() {
      return (Sub1 + sub2 + sub3) / 3;
  }
  public String grade() {
	  int Average=(Sub1+sub2+sub3)/3;
  if(Average>=85)return "grade:A";
  else if(Average>=70)return "grade:B";
  else if(Average>=50)return "grade:C";
  else return "grade:D";
  }
  
  public static void main(String []args) {
	 
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter StudentName:");
	  String name=sc.nextLine();
	  System.out.println("Enter maths marks:");
	  int sub1=sc.nextInt();
	  System.out.println("Enter physics marks:");
	  int sub2=sc.nextInt(); 
	  System.out.println("Enter english marks:");
	  int sub3=sc.nextInt();
	  StudentDetails sd=new  StudentDetails(name, Sub1, sub2, sub3);
	  System.out.println("StudentName:"+sd.getName());
	  System.out.println("maths marks:"+sd.calculateAverage());
	  System.out.println("grade:"+sd.grade());
	  System.out.println("marks status:"+sd.isPassed());
	  
	  
}
  
}
