package t16;

/**
 * Created by cheese on 2018/6/8.
 */
public class RunThread extends Thread {
    volatile private boolean isRuning = true;

    public boolean isRuning() {
        return isRuning;
    }

    public void setRuning(boolean runing) {
        isRuning = runing;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRuning==true){

        }
        System.out.println("线程被停止了！");
    }
}
