package setNewPropertiesLockOne;

/**
 * Created by cheese on 2018/6/8.
 */
public class ThreadA extends Thread{
    private Service service;
    private Userinfo userinfo;

    public ThreadA(Service service,
                   Userinfo userinfo) {
        super();
        this.service = service;
        this.userinfo = userinfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userinfo);
    }
}
