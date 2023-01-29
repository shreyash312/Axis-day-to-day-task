package Bridge_Pattern;

public class volvo  extends Bus{

    int radius, x,y;

    volvo(int x,int y,int radius,DesignCar obj) {
        super(obj);
        this.x=x;
        this.y=y;
        this.radius=radius;
        //TODO Auto-generated constructor stub
    }

    @Override
    void showDesign() {
        // TODO Auto-generated method stub
        DesignObj.showCarDesign(x, y, radius);
    }
    
}
