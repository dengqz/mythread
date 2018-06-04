package t12;

/**
 * Created by cheese on 2018/6/3.
 */
public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1？="+Thread.interrupted());
        System.out.println("是否停止2？="+Thread.interrupted());
        System.out.println("end!");
    }
}
//interrupted()方法具有清除状态的功能
