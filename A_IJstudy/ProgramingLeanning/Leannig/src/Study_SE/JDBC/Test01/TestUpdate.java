package Study_SE.JDBC.Test01;

import Study_SE.JDBC.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
    public static void main(String[] args) {
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = JDBCUtils.getConnection(); //连接数据库
            st = connection.createStatement(); //获得执行sql的对象
            String sql = "update `student` set  `email` = 'unknow@qq.com' where `stdNo` = '2'";

            int i = st.executeUpdate(sql);

            if (i > 0) {
                System.out.println("执行成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(connection, st, rs);
        }

    }
}


