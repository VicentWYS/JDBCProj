package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbUtil {
    //数据库地址
    private static String dbUrl = "jdbc:mysql://localhost:3306/db_book";
    //用户名
    private static String dbUserName = "root";
    //密码
    private static String dbPassword = "CVN32900";
    //驱动名称
    private static String jdbcName = "com.mysql.jdbc.Driver";

    /**
     * 获取数据库连接
     * @return
     * @throws Exception
     */
    public Connection getCon() throws Exception{
        Class.forName(jdbcName);
        Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        return con;
    }

    /**
     * 关闭连接
     * @param con
     * @throws Exception
     */
    public void close(Connection con, Statement statement) throws Exception{
        if(statement != null){
            statement.close();
            if(con != null){
                con.close();
            }
        }

    }
}
