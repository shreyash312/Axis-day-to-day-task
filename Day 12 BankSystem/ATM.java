import java.util.Scanner;

public class ATM implements ATMInterface{

    @Override
    public Customer deposit(Customer customer) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        float amount=sc.nextFloat();
        customer.account.accountBal=customer.account.accountBal+amount;
        System.err.println(customer.account.accountBal);
        Transaction transaction=new Transaction();
        transaction.addTransaction("deposite",amount,customer.account.accountBal);
        customer.account.transactions.add(transaction);
        return customer;
    }

    @Override
    public Customer withdraw(Customer customer) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Card no: ");
       long CardNo=sc.nextLong();
       System.out.println("Enter Pin: ");
       long pin=sc.nextLong();
       if(CardNo==customer.custCardNo && pin==customer.custPassword){
       System.out.println("Enter amount to withdraw");
        float amount=sc.nextFloat();
        if(amount < customer.account.accountBal && (customer.account.accountBal-amount)>1000){
            System.out.println("Collect amount");
            customer.account.accountBal=customer.account.accountBal-amount;
            System.out.println("Current Bal: "+customer.account.accountBal);
            Transaction transaction=new Transaction();
            transaction.addTransaction("withdraw",amount,customer.account.accountBal);
            customer.account.transactions.add(transaction);
            return customer;        
        }else{
                 System.out.println("Insufficiant Bal");
                 }
                }
        else{
                System.out.println("Wrong Credentials");
            }
            return customer;
    }

    

    @Override
    public Customer checkBal(Customer customer) {
        // TODO Auto-generated method stub
        System.out.println("Your current balance is RS. "+customer.account.accountBal);
        Transaction transaction= new Transaction();
        transaction.addTransaction("checkBalance", 0,customer.account.accountBal);
    customer.account.transactions.add(transaction);
    return customer;
    }
    
}
