package com.jdbc;

import model.Book;
import util.DbUtil;

import java.sql.Connection;
import java.sql.Statement;

public class demo05 {
    private static DbUtil dbUtil = new DbUtil();

    /**
     * 添加图书
     * 用传递图书类对象的方式添加图书
     *
     * @param book
     * @return
     * @throws Exception
     */
    private static int addBook(Book book) throws Exception {
        Connection con = dbUtil.getCon();       //获取连接
        String sql = "insert into t_book values(null, '" + book.getBookName() + "'," + book.getPrice() + ", '" + book.getAuthor() + "', " + book.getBookTypeId() + ")";

        Statement statement = con.createStatement();    //创建Statement
        int result = statement.executeUpdate(sql);
        dbUtil.close(con, statement);           //关闭Statement和连接

        return result;
    }

    /**
     * 更新图书
     * 根据Id号来确定要选中的图书
     * @param book
     * @return
     * @throws Exception
     */
    private static int updateBook(Book book) throws Exception {
        Connection con = dbUtil.getCon();       //获取连接
        String sql = "update t_book set bookName='" + book.getBookName() + "',price=" + book.getPrice() + ",author='" + book.getAuthor() + "',bookTypeId=" + book.getBookTypeId() + " where id=" + book.getId();
        Statement statement = con.createStatement();    //创建statement
        int result = statement.executeUpdate(sql);
        dbUtil.close(con, statement);           //关闭statement和连接

        return result;
    }

    /**
     * 删除图书
     * @param id
     * @return
     * @throws Exception
     */
    private static int deleteBook(int id) throws Exception{
        Connection con = dbUtil.getCon();       //获取连接
        String sql = "delete from t_book where id="+id;
        Statement statement = con.createStatement();        //创建Statement
        int result = statement.executeUpdate(sql);
        dbUtil.close(con, statement);           //关闭statement和连接

        return result;
    }


    public static void main(String[] args) throws Exception {
        int result = deleteBook(4);
        if (result == 1) {
            System.out.println("删除成功.");
        } else {
            System.out.println("删除失败.");
        }
    }
}
