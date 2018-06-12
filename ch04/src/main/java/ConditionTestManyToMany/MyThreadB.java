package ConditionTestManyToMany;

/**
 * @author : Cheese
 * @date : 2018/6/12
 * @description : TODO
 */
public class MyThreadB extends Thread {
    private MyService myService;
    public MyThreadB(MyService myService){
        super();
        this.myService=myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.get();

        }
    }
}
