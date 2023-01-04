public class UserInfoConstructor {

    public String name;
    private int userId;
    public String companyName;
    public String location;
    protected int age;
    private String position;

    Scanner sc=new Scanner(System.in);
    void DisplayUserDetails(){
        System.out.println("***Displaying user details ***");
        System.out.println("");
        System.out.println("NAME: " +name);
        System.out.println("");
        System.out.println("USER ID: " +userId);
        System.out.println("");
        System.out.println("COMPANY NAME: " +companyName);
        System.out.println("");
        System.out.println("LOCATION: " +location);
        System.out.println("");
        System.out.println("AGE: " +age);
        System.out.println("");
        System.out.println("POSITION: " +position);
        System.out.println("");

    }
    public static void main(String args[])
    {
       
        UserInfo u1=new UserInfo();
        u1.createUser();
        u1.DisplayUserDetails();
    }
    
}
