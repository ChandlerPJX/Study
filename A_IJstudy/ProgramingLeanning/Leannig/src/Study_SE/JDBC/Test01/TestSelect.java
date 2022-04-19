package Study_SE.JDBC.Test01;

import Study_SE.JDBC.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtils.getConnection();
            st = conn.createStatement();
            String sql = "select `stdName`,`pwd`,`sex`,`email` from `student`" +
                    "where sex = 'weman' and email ='test@.com'";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println("name is : " + rs.getObject("stdName"));
                System.out.println("sex is : " + rs.getObject("sex"));
                System.out.println("pwd is : " + rs.getObject("pwd"));
                System.out.println("email is : " + rs.getObject("email"));
                System.out.println("=============================");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(conn, st, rs);
        }

    }

}
