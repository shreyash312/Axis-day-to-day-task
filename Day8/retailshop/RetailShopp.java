package retailshop;

import java.util.Scanner;

public class RetailShopp implements retailInheritance  {
   
    @Override
    public float getTotalCost(float Tax, float Cost, float noFproducts) {
        float total =(Cost*(1+(Tax/100)))*noFproducts;
        return total;
        
    }

    @Override
    public float getTotalExtendedCost(float cost1, float cost2, float cost3) {
        float extendedCost=cost1+cost2+cost3;
        System.out.println("Total Extended Cost: "+extendedCost);
        return extendedCost;
        
    }

    @Override
    public double getTotalDiscount(float totalCost) {
        double discountCost = totalCost*(0.98);
        System.out.println("Total Discounted Cost: "+discountCost);
        return discountCost;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Cosmetics: ");
        int Cosmetics =sc.nextInt();

        System.out.println("Enter no of perfumes: ");
        int perfumes=sc.nextInt();

        System.out.println("Enter no of Clothes: ");
        int Clothes =sc.nextInt();

        RetailShopp rs=new RetailShopp();

        float cost1 =rs.getTotalCost(7,10000,Cosmetics);
        System.out.println("Cost of cosmetics : "+cost1);

        float cost2 =rs.getTotalCost(12,5000,perfumes);
        System.out.println("Cost of perfumes; "+cost2);

        float cost3 =rs.getTotalCost(4,7000,Clothes);
        System.out.println("Cost of clothes: "+cost3);
    
        float totalCost =rs.getTotalExtendedCost(cost1, cost2, cost3);

        rs.getTotalDiscount(totalCost);
    }

   
}
