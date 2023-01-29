package creationalPattern;

public class bank {
    
    private static bank bankObj=new bank();
    //static int time;
    private bank(){

    }


  public void bankStatus(int i){
        if(i >9 && i <18)
        {
            System.out.println("Bank is open");
        }
        else{
            System.out.println("Bank is closed");
        }
          
        
    }

    static bank getObject(){
        return bankObj;

    }
}
