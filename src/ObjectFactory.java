public class ObjectFactory {
    private static ObjectFactory instance=null;

    private ObjectFactory(){

    }
    public static synchronized ObjectFactory getInstance(){
        if(instance==null){
            instance=new ObjectFactory();
        }
        return instance;

    }



}
