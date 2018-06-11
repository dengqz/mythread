package joinTest2;

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
            threadTest.join();
            System.out.println("我想当threadTest对象执行完毕后我再执行，我做到了");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
