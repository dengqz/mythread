package t4_threadsafe;

/**
 * Created by carino on 2018/5/30.
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
    synchronized public static void doPost(String username,String password){
        try{
            usernameRef = username;
            if(username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username=" + usernameRef + " password="
            + password);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
