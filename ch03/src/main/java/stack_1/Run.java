package stack_1;

/**
 * Created by cheese on 2018/6/10.
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C r = new C(myStack);
        P_Thread pThread = new P_Thread(p);
        C_Thread rThread = new C_Thread(r);
        pThread.start();
        rThread.start();
    }
}
