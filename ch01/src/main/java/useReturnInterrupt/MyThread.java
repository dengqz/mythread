package useReturnInterrupt;

/**
 * Created by cheese on 2018/6/3.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        while(true){
            if(this.isInterrupted()){
                System.out.println("停止了！");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }
}
