package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by AbelKung on 2018/5/14.
 */
public class DBUtil {
    //数据库主机地址
    static String ip = "127.0.0.1";

    //数据库服务端口号
    static int port = 3306;

    //数据库名称
    static String database = "music";

    //编码方式
    static String encoding = "UTF-8";

    //用户名
    static String loginName = "root";

    //密码
    static String password = "kuang@90";

    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException{
        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s",ip,port,database,encoding);
        return DriverManager.getConnection(url,loginName,password);
    }

    public static void main(String args[]) throws SQLException {
        System.out.println(getConnection());
    }

}
