package singleton_7_1;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class MyObject implements Serializable {

    private static final long serialVersionUID = 475859292758385601L;
    //内部类方式
    private static class MyObjectHandler{
        private static final MyObject myObject = new MyObject();
    }
    private MyObject(){}
    public static MyObject getInstance(){
        return  MyObjectHandler.myObject;
    }
    protected Object readResolve()throws ObjectStreamException {
        System.out.println("调用了readResolve方法!");
        return MyObjectHandler.myObject;
    }
}
