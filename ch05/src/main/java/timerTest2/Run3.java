package timerTest2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by cheese on 2018/6/12.
 */
public class Run3 {
    private static Timer timer = new Timer();
    static public class MyTaskA extends TimerTask {
        @Override
        public void run() {
            System.out.println("A运行了！时间为："+new Date());
            timer.cancel();
        }
    }
    static public class MyTaskB extends TimerTask{
        @Override
        public void run() {
            System.out.println("B运行了时间为："+new Date());
        }
    }

    public static void main(String[] args) {
        try{
            Run2.MyTaskA taskA = new Run2.MyTaskA();
            Run2.MyTaskB taskB = new Run2.MyTaskB();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString ="2018-6-12 20:55:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间为："+dateRef.toLocaleString()+" 当前时间："
                    +new Date().toLocaleString());
            timer.schedule(taskA,dateRef,4000);
            timer.schedule(taskB,dateRef,4000);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
