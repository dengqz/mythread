package syn_Out_asyn;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class Test {
    public static void main(String[] args) {
        MyList myList = new MyList();
        MyThreadA a = new MyThreadA(myList);
        a.setName("A");
        a.start();
        MyThreadB b = new MyThreadB(myList);
        b.setName("B");
        b.start();
    }
}
