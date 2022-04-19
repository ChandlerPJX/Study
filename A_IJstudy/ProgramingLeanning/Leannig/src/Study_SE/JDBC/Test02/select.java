package Study_SE.JDBC.Test02;

import Study_SE.JDBC.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class select {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = JDBCUtils.getConnection();
            String sql = "select`stdNo`,`stdName`,`sex`,`email` from `student` " +
                    "where `email`=? and `sex`=?";
            st = con.prepareStatement(sql);

            st.setString(1,"test@.com");
            st.setString(2,"weman");

            rs = st.executeQuery();

            while (rs.next()){
                System.out.println("stdNo is :" + rs.getInt("stdNo"));
                System.out.println("stdName is :" + rs.getString("stdName"));
                System.out.println("sex is :" + rs.getString("sex"));
                System.out.println("email is :" + rs.getString("email"));
                System.out.println("-----分隔符---------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(con, st, rs);
        }

    }
}
