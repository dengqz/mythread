package wait_notify_insert_test;

/**
 * Created by cheese on 2018/6/10.
 */
public class BackupB extends Thread {
    private DBTools dbTools;
    public BackupB(DBTools dbTools){
        super();
        this.dbTools=dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
