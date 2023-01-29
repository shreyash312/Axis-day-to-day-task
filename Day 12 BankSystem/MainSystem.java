import java.util.Scanner;

public class MainSystem {
    Bank bankObj=new Bank();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MainSystem mainFile=new MainSystem();
        while(true){
            System.out.println("1:Add Cust");
            System.out.println("2:Deposit");
            System.out.println("3:Check Bal");
            System.out.println("4:Withdraw Amount");
            System.out.println("5:Transaction History");
            System.out.println("6: Exit From system");


            int choice=sc.nextInt();
            switch(choice){
                    case 1: 
                    Customer cust1=new Customer();
                    cust1.addCustomer();
                    mainFile.bankObj.map.put(cust1.account.accountNo, cust1);
                    break;
                    case 2:
                    System.err.println("Enter Account No");
                    long accountNo=sc.nextLong();
                    if(mainFile.bankObj.map.containsKey(accountNo)){
                        ATM atmobj=new ATM();
                       mainFile.bankObj.map.put(accountNo, atmobj.deposit(mainFile.bankObj.map.get(accountNo)));
                    }else{
                        System.out.println("Account no not valid");
                    }
                    break;
                    case 3:
                    System.out.println("Enter Account No to check Bal");
                    long accountNo1=sc.nextLong();
                    if(mainFile.bankObj.map.containsKey(accountNo1)){
                        ATM atmobj=new ATM();
                       mainFile.bankObj.map.put(accountNo1, atmobj.checkBal(mainFile.bankObj.map.get(accountNo1)));
                    }
                    break;

                    case 4:
                            System.out.println("Enter account no to withdraw amount: ");
                            long accountNo2=sc.nextLong();
                            if(mainFile.bankObj.map.containsKey(accountNo2)){
                                ATM atmobj=new ATM();
                                mainFile.bankObj.map.replace(accountNo2, atmobj.withdraw(mainFile.bankObj.map.get(accountNo2)));
                            }
                    break;

                    case 5:
                            System.out.println("Enter Acc no: ");
                           long accountNo3=sc.nextLong();
                            if(mainFile.bankObj.map.containsKey(accountNo3)){
                                mainFile.bankObj.map.get(accountNo3).account.transaction();
                            }
                    break;

                    case 6: System.exit(1);
                    default:
                    System.out.println("wrong choice");

                    

            }
        }
        
    }
}
