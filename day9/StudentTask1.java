package Collection;

import java.util.Scanner;

import javax.xml.stream.events.StartElement;

public class StudentTask1 {
    String name;
    int age;
    String place;
    String college;

   static int count=0;
    //StudentTask1 array[]=new StudentTask1[2];
    StudentTask1 array[];
    Scanner sc=new Scanner(System.in);

    public void addStudent(){
        if(count<array.length){
        StudentTask1 std1 = new StudentTask1();
        System.out.println("Enter Stuent Name: ");
        std1.name=sc.next();

        System.out.println("Enter Age: ");
        std1.age=sc.nextInt();

        System.out.println("Enter Place: ");
        std1.place=sc.next();

        System.out.println("Enter College name: ");
        std1.college=sc.next();

        array[count]=std1;
         count++;
        } 
        else{
            System.out.println("No more space...");
           
        }
        
    }

    void Display(){
        StudentTask1 std1 =new StudentTask1();
            try{

            for(int i=0;i<array.length;i++){
            System.out.println("Name: "+array[i].name +" "+ "ID: " +i);
            }
    
            System.out.println("Enter ID to see Details");
            int index=sc.nextInt();
             std1=array[index];
                
              System.out.println("Name: " +std1.name);
              System.out.println("Age: " +std1.age);     
              System.out.println("Place: " +std1.place);     
              System.out.println("College Name: " +std1.college);     
        }catch(Exception e)
        {
            System.out.println("First complete Add Data activity");
            //System.out.println(e.getMessage());
        }      
           
    }


    public static void main(String args[]){
       
        Scanner sc=new Scanner(System.in);
        int no;

        System.out.println("Enter no of students: ");
        no=sc.nextInt();

        StudentTask1 std1=new StudentTask1();
        std1.array=new StudentTask1[no];

        boolean state=true;

        while(state){
           
             System.out.println("1: Add Data");
            System.out.println("2: Show Data");
            System.out.println("3: exit");
            System.out.println("Enter choice: ");
            int ch=sc.nextInt();

            switch(ch){
                case 1: std1.addStudent();
                break;
                case 2: std1.Display();
                break;
                case 3: state=false;
                break;
             
            }
        }

    }
}
