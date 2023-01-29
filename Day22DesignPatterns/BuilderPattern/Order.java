package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List <hotelItem> itemList=new ArrayList<hotelItem>();

    public void addItems(hotelItem item){
            itemList.add(item);

    }
    public float getTotalCost(){
        float totalcost=0;

        for(hotelItem item:itemList){
           totalcost=totalcost+ item.price();
        }
        return totalcost;
    }
    public void showItem(){
        for(hotelItem item:itemList){
            System.out.println("item name: "+item.itemName());
            System.out.println("price:"+item.price());
        }
    }
}
