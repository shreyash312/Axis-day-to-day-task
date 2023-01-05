package Task1Inheritance;

public class Branch1 extends Bank {
    
    String branchName;
    int branchId;
    int branchTotalFund;
    double branchInterest;
    int loanAmt;

    public Branch1(int totalBankFund, double bankInterest, String brankName, int branchId, int branchTotalFund,
            double branchInterest, int loanAmt) {

        super(totalBankFund, bankInterest);
        
        this.branchName = brankName;
        this.branchId = branchId;
        this.branchTotalFund = branchTotalFund;
        this.branchInterest = branchInterest;
        this.loanAmt = loanAmt;
    }


    public void loan(){
        
        super.checkLoan(loanAmt);

        //print aprovedLoan
        super.totalInterest(branchInterest);
        //totalInterest()
        //print total interest
    }

        public static void main(String args[]){
            Branch1 br1=new Branch1(1000, 2.5, "Axis", 110,
                                     1000, 1.5, 500);
            br1.loan();

            //s.o.p(enter loan amount)
            //scan it
            //br1.checkloan(loanAmt)
        }

    }

