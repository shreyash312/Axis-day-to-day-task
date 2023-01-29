package BuilderPattern;

public class MainClass {
    public static void main(String[] args) {
        MainBuilderClass obj=new MainBuilderClass();
        Order order1=obj.orderVegItems();
        System.out.println("Veg items are ordered");
        order1.showItem();
        System.out.println("Total Cost: "+order1.getTotalCost());
        System.out.println("Non veg items ordered ");
        Order order2=obj.orderNonVegItems();
        order2.showItem();
        System.out.println("Total Cost ="+order2.getTotalCost());

    }
}
