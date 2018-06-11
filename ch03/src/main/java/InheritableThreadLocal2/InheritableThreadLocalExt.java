package InheritableThreadLocal2;

import java.util.Date;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue+" 我在子线程加的~!";
    }
}
