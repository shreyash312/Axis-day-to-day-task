import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class StudentTask1 {
    Scanner sc=new Scanner(System.in);
    String name; 
    int rollNo;
    int marks; 
    
    void addData(){
        System.out.println("Enter Name: ");
        name=sc.next();

        System.out.println("Enter Roll No");
        rollNo=sc.nextInt();

        System.out.println("Enter marks");
        marks=sc.nextInt();
      
        System.out.println("Data Addedd");
        
    }

    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);


        StudentTask1 st=new StudentTask1();

        ArrayList<StudentTask1> a1=new ArrayList<StudentTask1>();
        
        
        while(true){
            System.out.println("1:Add Data");
            System.out.println("2:Show data");
            System.out.println("3:Delete Data");
            System.out.println("4:Exit");

            System.out.println("Enter choice: ");
            int ch=sc.nextInt();

                switch(ch){
                    case 1: st.addData();
                            a1.add(st);      
                    break;
                    
                    case 2:   
                            Iterator it=a1.iterator();
                            while(it.hasNext()){
                               // System.out.println(it.next());
                                StudentTask1 st1=(StudentTask1) it.next();
                                System.out.println("Name: "+st1.name);
                                System.out.println("Roll No: "+st.rollNo);
                                System.out.println("Marks: "+st.marks);
                            }
           
                    break;

                    case 3: System.out.println("Enter index to delete");
                            int id=sc.nextInt();
                            a1.remove(id);
                    break;

                    case 4:
                    System.exit(1);
                    break;
                    
                }
        }

    }
}
