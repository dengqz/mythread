package synNotExtends;

/**
 * Created by cheese on 2018/6/7.
 */
public class Sub extends Main {
    @Override
    synchronized public void serviceMethod(){
        try{
            System.out.println("int sub 下一步sleep begin threadName="
            +Thread.currentThread().getName()+" time"
            +System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步sleep end threadName="
            +Thread.currentThread().getName()+" time="
            +System.currentTimeMillis());
            super.serviceMethod();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
