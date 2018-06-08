package t8;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class Task {
    synchronized public void otherMethod(){
        System.out.println("------------run--otherMethod");
    }
    public void doLongTimeTask(){
        synchronized (this){
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName="
                +Thread.currentThread().getName()+" i="+(i+1));
            }
        }
    }

}
