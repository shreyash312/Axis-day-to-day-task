package Bridge_Pattern;

public class BridgeDemo {
    
    public static void main(String[] args) {
        Bus marutiCar=new volvo(200, 100, 10, new Maruti());
    Bus bmwCar=new volvo(300, 150, 200, new BMW());
    
    marutiCar.showDesign();
    bmwCar.showDesign();
    }
}
