package map;

import java.util.Scanner;

public class student {
   public  String name;
    public int rollNo;
   public  String college;
   public  String place;
  public  String branch;
   public  int sem;

   public student(String name, int rollNo, String college, String place, String branch, int sem) {
      this.name = name;
      this.rollNo = rollNo;
      this.college = college;
      this.place = place;
      this.branch = branch;
      this.sem = sem;
   }

   public void display(){
      System.out.println("Student Name: "+this.name);
      System.out.println("Roll no:"+this.rollNo);
      System.out.println("Student Place: "+this.place);
      System.out.println("student college: "+this.college);
      System.out.println("Student Branch: "+this.branch);
      System.out.println("Student Sem: "+this.sem);
   }

   public void update(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter new branch");
      //String branch=sc.next();
     this.branch=sc.next();
   }
}
