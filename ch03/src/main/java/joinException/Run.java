package joinException;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class Run {
    public static void main(String[] args) {
        try{
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);
            c.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
