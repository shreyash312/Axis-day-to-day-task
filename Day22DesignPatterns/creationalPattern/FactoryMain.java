package creationalPattern;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {
        ObjectFactory obj1=new ObjectFactory();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter shape: ");
            String shape =sc.next();
            factoryObjectDrawClass shape1=obj1.DrawShape(shape);
            shape1.draw();
        }
        

        // factoryObjectDrawClass shape2=obj1.DrawShape("Triangle");
        // shape2.draw();
    }
}
