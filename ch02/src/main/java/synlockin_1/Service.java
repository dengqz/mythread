package synlockin_1;

/**
 * Created by cheese on 2018/6/7.
 */
public class Service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }
    synchronized public void service2(){
        System.out.println("service2");
        service3();
    }
    synchronized public void service3(){
        System.out.println("service2");
    }
}
