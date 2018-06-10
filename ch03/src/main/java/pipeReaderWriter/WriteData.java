package pipeReaderWriter;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * Created by cheese on 2018/6/10.
 */
public class WriteData {
    public void writeMethod(PipedWriter out){
        try{
            System.out.println("write:");
            for (int i = 0; i < 300; i++) {
                String outData = ""+(i+1);
                out.write(outData);
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
