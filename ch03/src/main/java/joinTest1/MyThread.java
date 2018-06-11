package joinTest1;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            int secondValue = (int) (Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
