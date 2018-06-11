package ThreadLocal22;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值 第一次get不再为null";
    }
}
