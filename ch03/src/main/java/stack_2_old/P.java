package stack_2_old;

/**
 * Created by cheese on 2018/6/10.
 */
public class P {
    private MyStack myStack;
    public P(MyStack myStack){
        super();
        this.myStack=myStack;
    }
    public void pushService(){
        myStack.push();
    }
}
