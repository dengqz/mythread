package t9;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class MyService {
    public MyOneList addServiceMethod(MyOneList list,String data){
        try{
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);//模拟从远程花费2秒取回数据
                    list.add(data);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return list;
    }
}
