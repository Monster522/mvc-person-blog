package com.monster.lin.mvc.person.blog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 类 <code>{类名称}</code>{处理Http请求的Servlet}
 *
 * @author zangbao.lin
 * @version 2019/1/24
 * @since JDK 1.8
 */

public class TestServlet extends HttpServlet {
    private static final long serialVersionUID = -1915463532411657451L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置response返回类型
        resp.setContentType("text/html;charset=UTF-8");
        //获取输出流
        PrintWriter out = resp.getWriter();

        //获取配置参数
        String value = getServletConfig().getInitParameter("name");

        System.out.println("ServletInfo："+ this.getServletInfo());
        try {
            // Write some content
            out.println("<html>");
            out.println("<head>");
            out.println("<title>MyFirstServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>servlet MyFirstServlet at " + req.getContextPath() + "</h2>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public String getServletInfo() {
        return super.getServletInfo();
    }
}
