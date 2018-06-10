package pipeInputOutput;

import java.io.PipedInputStream;

/**
 * Created by cheese on 2018/6/10.
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream input;
    public ThreadRead(ReadData read, PipedInputStream input){
        super();
        this.read=read;
        this.input=input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
