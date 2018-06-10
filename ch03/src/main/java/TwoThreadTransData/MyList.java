package TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cheese on 2018/6/9.
 */
public class MyList {
    private List list = new ArrayList();
    public void add(){
        list.add("aaa");
    }
    public int size(){
        return list.size();
    }
}
