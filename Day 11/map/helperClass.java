package map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class helperClass {
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,student> studentMap =new HashMap<Integer,student>();

    public void addStudent(){
        
        System.out.println("Enter Roll no: ");
        int rollNo=sc.nextInt();
        System.out.println("Enter name: ");
        String name=sc.next();
        
        System.out.println("Enter college: ");
        String college=sc.next();
        System.out.println("Enter Place: ");
        String place=sc.next();
        System.out.println("Enter Branch: ");
        String branch=sc.next();
        System.out.println("Enter Semister: ");
        int sem=sc.nextInt();
    
        while(this.studentMap.containsKey(rollNo)){
            System.out.println("Roll no must be unique");
            System.out.println("Enter another roll no: ");
            rollNo=sc.nextInt();
        }
        student std=new student(name, rollNo, college, place, branch, sem);
        this.studentMap.put(rollNo, std);

    }

    public void display(){
        System.out.println("Key  Roll No  Name  Branch  Semister  College" );
        for(Entry<Integer, student> m : studentMap.entrySet()){
           // System.out.println(m.getKey()+ "  "+m.getValue().rollNo + " "+m.getValue().name);
           System.out.println(+m.getKey() + "\t" +m.getValue().rollNo+"\t"+m.getValue().name+"\t"+m.getValue().branch+"\t"+m.getValue().sem+"\t"+m.getValue().college );
        }
    }
    public void searchStudent(){
        System.out.println("Enter Roll no to search: ");
        int rollNo=sc.nextInt();

        if(this.studentMap.containsKey(rollNo)){
            this.studentMap.get(rollNo).display();
        }else{
            System.out.println("Roll no is not present");
        }
    }

    public void deleteStudent(){
        System.out.println("Enter Roll no to Delete: ");
        int rollNo=sc.nextInt();
        student std=this.studentMap.remove(rollNo);
        //System.out.println("Student with " + num + " Removed");
        if(std!=null){
            System.out.println("Deleted student details");
            std.display();
        }
    }

    void updateStudent(){
        System.out.println("Enter Roll no to update: ");
        int rollNo=sc.nextInt();
        if(this.studentMap.containsKey(rollNo)){
            student std=this.studentMap.get(rollNo);
            std.update();
            this.studentMap.replace(rollNo, std);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        helperClass hc=new helperClass();
       
        while(true){
            System.out.println("1:Add Student");
            System.out.println("2:Display Data");
            System.out.println("3:Search Student");
            System.out.println("4:Delete Data");
            System.out.println("5:Update Branch");
            System.out.println("6:Exit");

            System.out.println("Enter choice: ");
            int ch=sc.nextInt();

                switch(ch){
                    case 1:     hc.addStudent();
                    break;
                    
                    case 2: hc.display();
                    break;

                    case 3:
                             hc.searchStudent();
                    break;

                    case 4:
                            hc.deleteStudent();
                    break;

                    case 5:
                            hc.updateStudent();
                    break;
                    case 6:
                    System.exit(1);
                    break;
                    
                    default:System.out.println("Wrong choide..");
                }
        }

    }
}
