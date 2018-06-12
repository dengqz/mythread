package tryLock_param;

/**
 * @author : Cheese
 * @date : 2018/6/12
 * @description : TODO
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException{
        final MyService service = new MyService();
        Runnable runnableRef = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()
                +"调用waitMethod时间:"+System.currentTimeMillis());
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();

    }
}
