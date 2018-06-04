package countPriority;

/**
 * Created by cheese on 2018/6/4.
 */
public class ThreadA extends Thread {
    private int count = 0;
    public int getCount(){
        return count;
    }

    @Override
    public void run() {
        while(true){
            count++;
        }
    }
}
