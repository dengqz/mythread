package timerTest5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by cheese on 2018/6/12.
 */
public class Run4 {
    private static Timer timer = new Timer();
    private static int runCount =0;
    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try{
                System.out.println("1 begin 运行了！时间为："+new Date());
                Thread.sleep(5000);
                System.out.println("1 end 运行了！时间为："+new Date());
                runCount++;
                if(runCount == 5){
                    timer.cancel();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try{
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString ="2018-6-12 21:48:00";
            Timer timer = new Timer();
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间为："+dateRef.toLocaleString()+" 当前时间："
                    +new Date().toLocaleString());
            timer.scheduleAtFixedRate(task1,dateRef,2000);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
