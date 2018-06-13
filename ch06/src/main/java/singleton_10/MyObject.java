package singleton_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class MyObject {
    public enum MyEnumSingleton{
        connectionFactory;
        private Connection connection;
        private MyEnumSingleton(){
            try{
                System.out.println("调用了MyObject的构造");
                String url = "jdbc:sqlserver://localhost:1079;databaseName=ghydb";
                String username="sa";
                String password="";
                String driveName="com.microsofe.sqlserver.jdbc.SQLServerDriver";
                Class.forName(driveName);
                connection = DriverManager.getConnection(url,username,password);
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        public Connection getConnection(){
            return connection;
        }
    }
    public static Connection getConnection(){
        return MyEnumSingleton.connectionFactory.getConnection();
    }
}
