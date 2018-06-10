package waitOld;


/**
 * Created by cheese on 2018/6/10.
 */
public class Add {
    private String lock;
    public Add(String lock){
        super();
        this.lock = lock;
    }
    public void add(){
        synchronized (lock){
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
