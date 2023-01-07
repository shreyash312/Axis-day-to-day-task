package Encapsulation;

import java.util.Scanner;

public class Login {
    public static void main(String args[]){
        EmailUser userData=new EmailUser();
    
        Login lgn = new Login();
        lgn.userLogin(userData);
        System.out.println("Change Password: ");
        lgn.changePassword(userData);
    }

   

    void userLogin(EmailUser userData){
        System.out.println("Enter usrname");
        Scanner sc=new Scanner(System.in);
        String userName=sc.next();
        System.out.println("Enter pass");
        String password=sc.next();

        // if(userName.equals(userData.getUserName())){

        // }

        // if(password.equals(userData.getUserPass())){

        // }

        if(userName.equals(userData.getUserName()) &&
        password.equals(userData.getUserPass()))
        {
            System.out.println("Successss");
        }
        else{
            System.out.println("Failed");
        }

    }

    void changePassword(EmailUser userData) {
        System.out.println("Enter usrname");
        Scanner sc=new Scanner(System.in);
        String userName=sc.next();
        System.out.println("Enter old pass");
        String password=sc.next();

        if(userName.equals(userData.getUserName()) &&
        password.equals(userData.getUserPass()))
        {
            System.out.println("Enter new password");
            String newPassword=sc.next();
            userData.setPassword(newPassword);
            System.out.println("Updated Password");
        }
        else{
            System.out.println("Failed to update pass");
        }

    }
    
}
