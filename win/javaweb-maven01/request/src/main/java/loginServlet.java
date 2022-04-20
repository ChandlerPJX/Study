import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class loginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 解决后台乱码问题
        req.setCharacterEncoding("utf-8");
        String username = new String();
        username = req.getParameter("username");
        String pwd = new String();
        pwd = req.getParameter("pwd");
        String[] hobbys = req.getParameterValues("hobbys");
        System.out.println(Arrays.toString(hobbys));
//         这里的/ 代表当前的web应用
        if (username.equals("pjx") && pwd.equals("123")) {
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("fail.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
