package t16;

/**
 * Created by cheese on 2018/6/8.
 */
public class Run {
    public static void main(String[] args) {
        try{
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRuning(false);
            System.out.println("已经赋值为false");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
