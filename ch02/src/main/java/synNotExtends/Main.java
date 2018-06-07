package synNotExtends;

/**
 * Created by cheese on 2018/6/7.
 */
public class Main {
    synchronized public void serviceMethod(){
        try{
            System.out.println("int main 下一步sleep begin threadName="
            +Thread.currentThread().getName()+" time="
            +System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步sleep end threadName="
            +Thread.currentThread().getName() + " time="
            +System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
