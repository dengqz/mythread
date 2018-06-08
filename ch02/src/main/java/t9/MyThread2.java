package t9;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class MyThread2 extends Thread {
    private MyOneList list;
    public MyThread2(MyOneList list){
        super();
        this.list=list;
    }

    @Override
    public void run() {
        MyService msRef = new MyService();
        msRef.addServiceMethod(list,"B");
    }
}
