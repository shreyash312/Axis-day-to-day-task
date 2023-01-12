import java.util.LinkedList;

public class task2 {
    
    public static void main(String[] args) {

        LinkedList ll=new LinkedList<>();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);


        System.out.println(ll.get(0));
        System.out.println(ll.get(1));
        System.out.println(ll.get(2));
        System.out.println(ll.get(3));

System.out.println("After pop");
        ll.pop();

        System.out.println(ll.get(0));
        System.out.println(ll.get(1));
        System.out.println(ll.get(2));
        System.out.println(ll.get(3));


    }
}
