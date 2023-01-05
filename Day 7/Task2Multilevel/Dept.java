package Task2Multilevel;

public class Dept extends College {
    
    String deptName;
    int DeptID;

    public Dept(String collegeName, String collegePlace, int collegeID, String deptName, int deptID) {
        super(collegeName, collegePlace, collegeID);
        this.deptName = deptName;
        DeptID = deptID;
    }

    public void showDeptDetails(){
        System.out.println(" ");
        System.out.println("Dept Name: "+deptName);
        System.out.println("Dept ID: "+DeptID);
    }

}
