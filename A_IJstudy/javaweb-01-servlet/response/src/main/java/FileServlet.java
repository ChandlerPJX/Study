import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileInputStream;
import java.io.IOException;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1 获取下载路径
        String realPath = this.getServletContext().getRealPath("/Users/pjxs/Downloads/A_IJstudy/javaweb-01-servlet/response/target/classes/1.jpg");
        System.out.println("下载路径 : " + realPath);
        // 2 获取下载的文件名
        String fileName = realPath.substring(realPath.lastIndexOf("/") + 1);
        System.out.println("下载名字 : " + fileName);
        // 3 让浏览器支持下载
        resp.setHeader("Content-disposition", "attachment;filename" + fileName);
        // 4 获取下载的输入流
        FileInputStream in = new FileInputStream(realPath);
        // 5 创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];
        // 获取输出的响应流
        ServletOutputStream out = resp.getOutputStream();
        //把 out 对象放入缓冲区
        while ((len = in.read(buffer)) > 0) {
            out.write(buffer, 0, len);
        }
        in.close();
        out.close();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
