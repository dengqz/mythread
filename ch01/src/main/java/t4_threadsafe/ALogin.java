package t4_threadsafe;

/**
 * Created by carino on 2018/5/30.
 */
public class ALogin extends Thread{
    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
