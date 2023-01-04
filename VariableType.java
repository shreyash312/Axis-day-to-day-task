class VariableType{
    String name; //global(Instance) variable
    static String author="Shreyash";

    public void display()
    {
        int age=20; //local variable 
        //scope of variable
        System.out.println(age);
        System.out.println(name);

        VariableType vt = new VariableType();
        vt.author="JAdhav Shreyash";

        System.out.println(author);
    }

    public static void demo(){
        System.out.println("The static method");
    }

    public static void main(String args[]) {
        VariableType vt2=new VariableType();
        vt2.display();
        demo(); //static method can be accesed without creating object.
        
    }
}