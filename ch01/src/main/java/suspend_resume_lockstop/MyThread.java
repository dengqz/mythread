package suspend_resume_lockstop;

/**
 * Created by cheese on 2018/6/4.
 */
public class MyThread extends Thread {
    private long i =0;

    @Override
    public void run() {
        while(true){
            i++;
            System.out.println(i);
        }
    }
}
