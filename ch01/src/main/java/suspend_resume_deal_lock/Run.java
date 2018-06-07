package suspend_resume_deal_lock;

/**
 * Created by cheese on 2018/6/4.
 */
public class Run {
    public static void main(String[] args) {
        try{
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread(){
                @Override
                public void run() {
                    System.out.println("thread2启动了，但进不了print String()方法！" +
                            "只打印一个begin");
                    System.out.println("因为printString()方法被a线程锁定并且永远" +
                            "suspend暂停了");
                    object.printString();
                }
            };
            thread2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
