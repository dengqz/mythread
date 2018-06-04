package useStopMethodThreadTest;

/**
 * Created by cheese on 2018/6/3.
 */
public class MyThread extends Thread {
    private int i =0;

    @Override
    public void run() {
        try{
            while(true){
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
