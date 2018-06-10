package pipeReaderWriter;

import java.io.PipedWriter;

/**
 * Created by cheese on 2018/6/10.
 */
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedWriter out;
    public ThreadWrite(WriteData write,PipedWriter out){
        super();
        this.write=write;
        this.out=out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
