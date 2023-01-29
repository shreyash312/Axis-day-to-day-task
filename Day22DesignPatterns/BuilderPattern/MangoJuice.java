package BuilderPattern;

public abstract class MangoJuice implements hotelItem{

    // @Override
    // public String itemName() {
    //     // TODO Auto-generated method stub
    //     return null;
    // }

    @Override
    public Packing packing() {
        // TODO Auto-generated method stub
        return new bottle();
    }

    @Override
   abstract public float price() ;
    
    
}
