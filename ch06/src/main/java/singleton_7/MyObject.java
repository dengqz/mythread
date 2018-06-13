package singleton_7;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class MyObject {
    //内部类方式
    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }
    private MyObject(){}
    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}
