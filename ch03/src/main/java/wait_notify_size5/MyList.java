package wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cheese on 2018/6/10.
 */
public class MyList {
    private static List list = new ArrayList();
    public static void add(){
        list.add("anyString");
    }
    public static int size(){
        return list.size();
    }
}
