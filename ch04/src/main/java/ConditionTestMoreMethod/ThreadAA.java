package ConditionTestMoreMethod;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class ThreadAA extends Thread {
    private MyService service;
    public ThreadAA(MyService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
