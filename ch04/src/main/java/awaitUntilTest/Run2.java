package awaitUntilTest;

/**
 * @author : Cheese
 * @date : 2018/6/12
 * @description : TODO
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException{
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
        Thread.sleep(2000);
        MyThreadB myThreadB = new MyThreadB(service);
        myThreadB.start();

    }
}
