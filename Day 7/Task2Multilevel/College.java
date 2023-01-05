package Task2Multilevel;

public class College {
    String collegeName;
    String CollegePlace;
    int CollegeID;

    

    public College(String collegeName, String collegePlace, int collegeID) {
        this.collegeName = collegeName;
        CollegePlace = collegePlace;
        CollegeID = collegeID;
    }



    public void showCollegeDetails(){
        System.out.println(" ");
        System.out.println("College Name: "+collegeName);
        System.out.println("College Place: "+CollegePlace);
        System.out.println("College ID: "+CollegeID);
    }
}
