package Task1Inheritance;

public class Bank  {
    
    String bankName;
    int bankId;
    long bankPhone;
    double interest;

    private int totalBankFund;
    private double bankInterest;

     public Bank(int totalBankFund, double bankInterest) {
        this.totalBankFund = totalBankFund;
        this.bankInterest = bankInterest;
       
    }

    void checkLoan(int loanAmt){
        if(loanAmt<totalBankFund)
        {
            System.out.println("Your loan is approved..");
        }
        else{
            System.out.println("Your loan is not approved..");
        }
        
     }

     void totalInterest(Double branchInterest){
        //return bankInterest+branchInterest
        interest=bankInterest+branchInterest;
        System.out.println("TotalInterest= "+interest);
     }
}
