package synchronizedBlockLockAll.test2;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class MyObject {
    synchronized public void speedPrintString(){
        System.out.println("speedPrintString____getLock time="
        +System.currentTimeMillis()+" run ThreadName="
        +Thread.currentThread().getName());
        System.out.println("-------------");
        System.out.println("speedPrintString releaseLock time="
        +System.currentTimeMillis()+" run ThreadName="
        +Thread.currentThread().getName());
    }
}
