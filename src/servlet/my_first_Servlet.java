package servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "my_first_Servlet", value = "/my_first_Servlet")
public class my_first_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
PrintWriter pw=response.getWriter();
pw.println("<a href=https://cn.bing.com/?mkt=zh-CN>bing</a><br>");
pw.println("<h1>get</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        pw.println("<a href=\"index.jsp\">返回</a><br>");
    }
}
