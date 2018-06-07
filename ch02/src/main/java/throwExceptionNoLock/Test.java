package throwExceptionNoLock;

/**
 * Created by cheese on 2018/6/7.
 */
public class Test {
    public static void main(String[] args) {
        try{
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(500);
            Thread b = new ThreadB(service);
            b.setName("B");
            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
//出现异常，锁自动释放