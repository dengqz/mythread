package stateTest2;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态："+t.getState());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
