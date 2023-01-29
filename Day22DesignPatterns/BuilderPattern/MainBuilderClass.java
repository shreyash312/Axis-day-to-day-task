package BuilderPattern;

public class MainBuilderClass {
  
    public Order orderVegItems(){
        Order order=new Order();
        order.addItems(new vegDosa());
        order.addItems(new orangeJiuce() );
        return order;

  }  
  public Order orderNonVegItems(){
    Order order=new Order();
        order.addItems(new nonVegDosa());
        
    return order;

}  
}
