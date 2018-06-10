package wait_notify_insert_test;

/**
 * Created by cheese on 2018/6/10.
 */
public class BackupA extends Thread {
    private DBTools dbTools;
    public BackupA(DBTools dbTools){
        super();
        this.dbTools=dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
