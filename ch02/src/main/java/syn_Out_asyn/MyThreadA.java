package syn_Out_asyn;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class MyThreadA extends Thread {
    private MyList list;
    public MyThreadA(MyList list){
        super();
        this.list=list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add("threadA"+(i+1));
        }
    }
}
