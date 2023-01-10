package Task1;

import java.util.Scanner;

public class userInfo extends Branch  {
    

    Scanner sc =new Scanner(System.in);
    String userName;
    float loanAmt;
    userInfo usrArray[];
    static int count=0;

    void loan(){
        if(count<usrArray.length){
            userInfo ui=new userInfo();
            System.out.println("Enter name: ");
            ui.userName=sc.next();
            System.out.println("Enter Loan amount: ");
            ui.loanAmt=sc.nextFloat();
                if(ui.loanAmt < ui.getTotalBankFund() && ui.loanAmt < ui.getBranchTotalfound()) {
                    
                    usrArray[count]=ui;
                    count++;
                    System.out.println("Loan is aproved.");
                }
                else{
                    System.out.println("No loan is aproved.");
                }
        
        }else{
            System.out.println("no space to add more user data");
        }
    }

    void Display(){
        userInfo ui=new userInfo();
            try{

            for(int i=0;i<usrArray.length;i++){
            System.out.println("Name: "+usrArray[i].userName +" "+ "ID: " +i);
            }
    
            System.out.println("Enter ID to see Details");
            int index=sc.nextInt();
             ui=usrArray[index];
                
              System.out.println("Name: " +ui.userName);
              System.out.println("Loan Amount: "+ui.loanAmt);
                   
        }catch(Exception e)
        {
            System.out.println("First complete Add Data activity");
            //System.out.println(e.getMessage());
        }      
           
    }


    public static void main(String args[]) {
        userInfo ui=new userInfo();
        Scanner sc =new Scanner(System.in);
      
        System.out.println("Enter no of USers: ");
        int  no=sc.nextInt();
        ui.usrArray=new userInfo[no];
       
        while(true){
            System.out.println("1. Check for loan ");
            System.out.println("2. Display approved loan users ");
            System.out.println("3: Exit");
            System.out.println("Enter Choice: ");
            int ch=sc.nextInt();
            switch(ch){
                    case 1: ui.loan();
                    break;

                    case 2:ui.Display();
                    break;

                    case 3:
                    System.exit(1);
                    break;
            }
        }
    }
}
