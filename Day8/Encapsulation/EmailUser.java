package Encapsulation;

public class EmailUser {
    private String userName="yash312";
    private String password="AdminYash";
    
    String getUserName(){
        return this.userName;
    }

    String getUserPass(){
        return this.password;
    }

    void setPassword(String newPassword){
        this.password=newPassword;
    }
}
