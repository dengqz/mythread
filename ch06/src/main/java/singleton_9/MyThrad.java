package singleton_9;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class MyThrad extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.connectionFactory.getConnection().hashCode());
        }
    }
}
