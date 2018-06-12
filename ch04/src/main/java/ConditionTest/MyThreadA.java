package ConditionTest;

/**
 * @author : Cheese
 * @date : 2018/6/12
 * @description : TODO
 */
public class MyThreadA extends Thread {
    private MyService myService;

    public MyThreadA(MyService myService){
        super();
        this.myService=myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.set();
        }
    }
}
