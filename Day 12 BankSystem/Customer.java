import java.util.Scanner;

public class Customer implements CustomerInterface {
    public Account account;
    String custName="";
    int custId=0;
    String custEmail="";
    int custPassword=0;
    long custPhone=0;
    long custCardNo=0;
    String custAddress="";

    @Override
    public void addCustomer() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Cust ID:");
        this.custId=sc.nextInt();
        System.out.println("Enter Cust Name: ");
        this.custName=sc.next();
        System.out.println("Enter cust Email: ");
        this.custEmail=sc.next();
        System.out.println("Enter Password: ");
        this.custPassword=sc.nextInt();
        System.out.println("Enter Cust Phone: ");
        this.custPhone=sc.nextLong();
        System.out.println("Enter Cust Card Num: ");
        this.custCardNo=sc.nextLong();
        System.out.println("Enter Cust Address: ");
        this.custAddress=sc.next();

        this.account=new Account().addAccount();
        
    }

    @Override
    public void deleteCustomer() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void editCustomer() {
        // TODO Auto-generated method stub
        
    }
    
}
