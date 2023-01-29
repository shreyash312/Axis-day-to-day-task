
//declaring singlton class

package creationalPattern;

public class SingleObject{
    
    private static SingleObject singleObjectObj=new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getObject(){
        return singleObjectObj;
        
    }
}