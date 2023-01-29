import java.util.ArrayList;
import java.util.Scanner;

public class Account extends Bank implements AccountInterface {
    ArrayList<Transaction> transactions=new ArrayList<Transaction>();
    long accountNo=0;
    float accountBal=0;
    String accountType="";
    @Override
    public Account addAccount() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account No: ");
        this.accountNo=sc.nextLong();
        System.out.println("Enter Acc Bal: ");
        this.accountBal=sc.nextFloat();
        System.out.println("Enter Acc Type: ");
        this.accountType=sc.next();
        return this;
        
    }

    @Override
    public void deleteAccount() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void editAccount() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void searchAccount() {
        // TODO Auto-generated method stub
        
    }

    void transaction(){
        
        for(Transaction obj:transactions){
            System.out.println(obj.transDate);
            System.out.println(obj.transType);
            System.out.println(obj.transAmt);
            System.out.println(obj.currentBal);
            System.out.println("------------------------------");
        }
    }
    
}
