package synlockin_2;

/**
 * Created by cheese on 2018/6/7.
 */
public class Sub extends Main {
    synchronized public void operateISubMethod(){
        try{
            while(i>0){
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
