package doubleSynBlockOneTwo;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class ThreadB extends Thread{
    private ObjectService service;
    public ThreadB(ObjectService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }
}
