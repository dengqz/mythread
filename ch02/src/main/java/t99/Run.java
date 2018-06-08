package t99;

/**
 * Created by cheese on 2018/6/8.
 */
public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        printStringService.printStringMethod();
        System.out.println("我要停止它！ stopThread="
        +Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
