package singleton_7_1;

import java.io.*;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class SaveAndRead {
    public static void main(String[] args) {
        try{
            MyObject myObject = MyObject.getInstance();
            FileOutputStream forRef = new FileOutputStream(new File(
                    "myObjectFile.txt"
            ));
            ObjectOutputStream oosRef = new ObjectOutputStream(forRef);
            oosRef.writeObject(myObject);
            oosRef.close();
            forRef.close();
            System.out.println(myObject.hashCode());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            FileInputStream fisRef = new FileInputStream(new File(
                    "myObjectFile.txt"
            ));
            ObjectInputStream iosRef = new ObjectInputStream(fisRef);
            MyObject myObject = (MyObject)iosRef.readObject();
            iosRef.close();
            fisRef.close();
            System.out.println(myObject.hashCode());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
