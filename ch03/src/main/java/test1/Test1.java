package test1;

/**
 * Created by cheese on 2018/6/9.
 */
public class Test1 {
    public static void main(String[] args) {
        try{
            String newString = new String("");
            newString.wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
