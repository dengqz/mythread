package joinLong;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class Test {
    public static void main(String[] args) {
        try{
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join(2000);//只等两秒
            //Thread.sleep(2000);
            System.out.println(" end time="+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
