public class ConstuctorOverloading {
    public String name;
    private int userId;
    public String companyName;
    public String location;
    protected int age;
    private String position;

    public ConstuctorOverloading(String name, int userId, String companyName, String location,int age, String position){
        this.name=name;
        this.userId=userId;
        this.companyName=companyName;
        this.location=location;
        this.age=age;
        this.position=position;

    }

    ConstuctorOverloading(){
        System.out.println("default constroctor called...");
    }


    public static void main(String args[]) {
        ConstuctorOverloading c1 =new ConstuctorOverloading("Shreyas",2112,"Axis","Delhi",22,"TechLead");
        System.out.println(c1.name +" "+c1.userId +" "+c1.companyName +" "+c1.location +" "+c1.age +" "+c1.position);

        ConstuctorOverloading c2=new ConstuctorOverloading();
    }
    
}
