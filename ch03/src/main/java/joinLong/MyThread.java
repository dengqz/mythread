package joinLong;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("begin Timer="+System.currentTimeMillis());
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
