package runMethodUseStopMethod;

/**
 * Created by cheese on 2018/6/3.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        try{
            this.stop();
        }catch (ThreadDeath e){
            System.out.println("进入了catch()方法！");
            e.printStackTrace();
        }
    }
}
