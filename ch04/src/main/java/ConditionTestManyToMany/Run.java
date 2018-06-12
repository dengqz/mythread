package ConditionTestManyToMany;

/**
 * @author : Cheese
 * @date : 2018/6/12
 * @description : TODO
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        MyThreadA[] threadA = new MyThreadA[10];
        MyThreadB[] threadB = new MyThreadB[10];
        for (int i = 0; i < 10; i++) {
            threadA[i] = new MyThreadA(myService);
            threadB[i] = new MyThreadB(myService);
            threadA[i].start();
            threadB[i].start();
        }
    }
}
