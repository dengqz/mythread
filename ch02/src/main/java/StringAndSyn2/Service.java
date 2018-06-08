package StringAndSyn2;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class Service {
    public static void print(Object object){
        try{
            synchronized (object){
                while(true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
