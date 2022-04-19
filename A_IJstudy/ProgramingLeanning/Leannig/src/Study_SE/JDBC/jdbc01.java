package Study_SE.JDBC;

import java.sql.*;

public class jdbc01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); //固定写法
        String url =  "jdbc:mysql://127.0.0.1:3307/school?&useSSL=false&serverTimezone=UTC";
        // 连接数据库的路径
        String usrName = "root";
        String password = "pjxi1997";

        // 连接数据库成功， connection 代表连接的数据库
        Connection connection = DriverManager.getConnection(url, usrName, password);

        // statement 是执行sql的对象
        Statement statement = connection.createStatement();

        // sql语句
        String sql = "select * from student";

        //返回的结果集合 query 表示查找， 删除与更新用 update
        ResultSet result = statement.executeQuery(sql);

        //返回的结果是链表形式
        while (result.next()) {
            System.out.println("stdNo : " + result.getObject("stdNo"));
            System.out.println("stdName : " + result.getObject("stdName"));
            System.out.println("pwd : " + result.getObject("pwd"));
            System.out.println("email : " + result.getObject("email"));
            System.out.println("address : " + result.getObject("address"));
            System.out.println("----------------------------");
        }
        // 释放资源
        result.close();
    }
}
