package ConditionTestMoreMethod;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
