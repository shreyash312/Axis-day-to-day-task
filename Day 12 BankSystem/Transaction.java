import java.util.Date;

public class Transaction implements TransactionInterface {
    int transID=0;
    float transAmt;
    String transType;
    Date transDate;
    float currentBal;

    @Override
    public void addTransaction(String transType,float transAmt,float currentBal) {
        this.transDate=new Date();
        this.transType=transType;
        this.transAmt=transAmt;
        this.currentBal=currentBal;
    }
    
}
