package singleton_8;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class MyObject {
    private static MyObject instance = null;
    private MyObject(){

    }
    static {
        instance = new MyObject();
    }
    public static MyObject getInstance(){
        return instance;
    }
}
