package pipeReaderWriter;

import java.io.PipedReader;

/**
 * Created by cheese on 2018/6/10.
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedReader input;
    public ThreadRead(ReadData read,PipedReader input){
        super();
        this.read=read;
        this.input=input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
