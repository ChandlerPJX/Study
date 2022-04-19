package Study_SE.JDBC.Test02;

import Study_SE.JDBC.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collections;

public class update {


    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = JDBCUtils.getConnection();

            String sql = "update `student` set `email`=? where `email`=?";
            st = conn.prepareStatement(sql);
            st.setString(1, "unkonw@qq.com");
            st.setString(2, "test@qq.com");
            int i = st.executeUpdate();
            if (i > 0) {
                System.out.println("execute success!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(conn, st, null);
        }

    }

}
