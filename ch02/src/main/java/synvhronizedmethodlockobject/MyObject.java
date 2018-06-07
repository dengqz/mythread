package synvhronizedmethodlockobject;

/**
 * Created by cheese on 2018/6/6.
 */
public class MyObject {
    synchronized public void methodA(){
        try{
            System.out.println("begin methodA threadName="
            +Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
