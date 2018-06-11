package ConditionTestMoreMethod;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class ThreadBB extends Thread {
    private MyService service;
    public ThreadBB(MyService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
