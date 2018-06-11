package ThreadLocal33;

import java.util.Date;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class ThreadLocalExt extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
