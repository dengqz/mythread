package useStopMethodThreadTest;

/**
 * Created by cheese on 2018/6/3.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
