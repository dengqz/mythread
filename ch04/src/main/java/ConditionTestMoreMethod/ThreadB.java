package ConditionTestMoreMethod;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class ThreadB extends Thread {
    private MyService service;
    public ThreadB(MyService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
