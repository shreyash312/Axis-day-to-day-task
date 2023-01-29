package Bridge_Pattern;

public class BMW implements DesignCar{

    @Override
    public void showCarDesign(int Xdemension, int Ydimension, int radius) {
        // TODO Auto-generated method stub
        System.out.println("This is BMW car the radius is "+ radius +" Dimension of car X: "+Xdemension+"  Y:  "+Ydimension);

    }
    
}
