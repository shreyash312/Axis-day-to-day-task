package BuilderPattern;

public abstract class Dosa implements hotelItem{

    // @Override
    // public String itemName() {
    //     // TODO Auto-generated method stub
    //     return null;
    // }

    public Packing packing(){
       return new wrapperPacking();
    }

    @Override
    abstract public float price() ;
    
}
