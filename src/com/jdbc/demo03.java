package com.jdbc;

import util.DbUtil;

import java.sql.Connection;
import java.sql.Statement;

public class demo03 {


    public static void main(String[] args) throws Exception {
        DbUtil dbUtil = new DbUtil();           //数据库连接封装在DbUtil类中
        String sql = "insert into t_book values(null, '美的历程',12, '李泽厚', 6 )";
        Connection con = dbUtil.getCon();       //连接数据库

        Statement statement = con.createStatement();
        int result = statement.executeUpdate(sql);
        System.out.println("操作的结果：处理了" + result + "条数据.");

        statement.close();          //关闭statement
        con.close();                //关闭连接(注意顺序不能颠倒)
    }
}
