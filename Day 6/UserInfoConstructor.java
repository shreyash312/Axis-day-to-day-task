
public class UserInfoConstructor {

    public String name;
    private int userId;
    public String companyName;
    public String location;
    protected int age;
    private String position;


  public  UserInfoConstructor(String userName,int userid,String userCompany,String userLocation, int userAge, String userPosition){
        name=userName;
        userId=userid;
        companyName=userCompany;
        location=userLocation;
        age=userAge;
        position=userPosition;

    }

    public static void main(String args[])
    {
       
        UserInfoConstructor u1=new UserInfoConstructor("yash",1234,"Axis","Mumbai", 21,"Manager");
       System.out.println(u1.name+ "  " +u1.userId +"  " +u1.companyName+ "  " +u1.location+"  "+u1.age +"  "+ u1.position);
       

    }
    
}
