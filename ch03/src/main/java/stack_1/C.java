package stack_1;

/**
 * Created by cheese on 2018/6/10.
 */
public class C {
    private MyStack myStack;
    public C(MyStack myStack){
        super();
        this.myStack=myStack;
    }
    public void popService(){
        System.out.println("pop="+myStack.pop());
    }
}
