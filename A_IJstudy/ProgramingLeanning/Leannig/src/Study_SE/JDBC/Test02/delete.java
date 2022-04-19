package Study_SE.JDBC.Test02;

import Study_SE.JDBC.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = JDBCUtils.getConnection();
            String  sql = "Delete from `student` where `stdNo`=?;";

            st = conn.prepareStatement(sql);

            st.setInt(1,2);

            int i = st.executeUpdate();
            if(i > 0){
                System.out.println("execute success!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(conn,st,null);
        }

    }
}
