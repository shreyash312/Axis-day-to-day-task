package creationalPattern;

public class ObjectFactory {

   
        public factoryObjectDrawClass DrawShape(String type) {
            
            if(type==null){
                return null;
            }
            if(type.equalsIgnoreCase("Rectangle")){
                return new FactoryRectangle();
            }
            if(type.equalsIgnoreCase("Triangle")){
                return new FactoryTriangle();
            }
            return null;
        }
    
}
