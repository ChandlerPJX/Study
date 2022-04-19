package Study_SE.JDBC.Test02;

import Study_SE.JDBC.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//避免 sql注入
public class insert {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = JDBCUtils.getConnection();

            // 使用? 占位符
            String sql = "insert into `student`(`stdName`,`pwd`,`sex`,`email`,`birthday`,`stdNo`)"
                    + "values(?,?,?,?,?,?)";
            st = conn.prepareStatement(sql); //预编译sql， 先写sql，然后不执行
            //手动赋值
            st.setString(1,"老六2");
            st.setString(2,"laoliugaisi");
            st.setString(3,"男");
            st.setString(4,"laoliu@qq.com");
            st.setDate(5,new java.sql.Date(new java.util.Date().getTime()));
            st.setInt(6,2);

           int i =  st.executeUpdate();

           if(i > 0){
               System.out.println("execute success !");
           }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(conn,st,null);
        }

    }
}
