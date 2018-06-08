package synchronizedBlockLockAll.test3;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class MyObject {
    public void speedPrintString(){
        synchronized (this){
            System.out.println("speedPrintString____getLock time="
            +System.currentTimeMillis()+" run ThreadName="
            +Thread.currentThread().getName());
            System.out.println("----------");
            System.out.println("speedPrintString releaseLock time="
            +System.currentTimeMillis()+" run ThreadName="
            +Thread.currentThread().getName());
        }
    }
}
