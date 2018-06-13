package singleton_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public enum  MyObject {
    connectionFactory;
    private Connection connection;
    private MyObject(){
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
