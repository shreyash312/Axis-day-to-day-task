package Task2Multilevel;

public class Student extends Dept{
    String StudName;
    String StudPlace;
    int StudID;

   

    public Student(String collegeName, String collegePlace, int collegeID, String deptName, int deptID, String studName,
            String studPlace, int studID) {
        super(collegeName, collegePlace, collegeID, deptName, deptID);
        StudName = studName;
        StudPlace = studPlace;
        StudID = studID;
    }

    void showStudentDetails(){
        System.out.println(" ");
        System.out.println("Student Name: "+StudName);
        System.out.println("Student Place: "+StudPlace);
        System.out.println("Student ID: "+StudID);
    }

    public static void main(String args[]){
        Student s1=new Student("AXIS School of Fintech","Delhi",10001,
                             "IT Dev",1001,
                             "Shreyash","Mumbai",101);

        s1.showCollegeDetails();
        s1.showDeptDetails();
        s1.showStudentDetails();
    }
}
