package com.monster.lin.mvc.person.blog.servlet.forword;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 类 <code>{类名称}</code>{此类功能描述}
 *
 * @author zangbao.lin
 * @version 2019/1/31
 * @since JDK 1.8
 */
@WebServlet(name = "BigEar",urlPatterns = {"/ear"})
public class OrdinaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //重定向
        resp.sendRedirect("https://www.baidu.com");

        //getAttribute是获取在servlet中设置的参数
        //getParameter是获取请求中的参数
//        req.setAttribute("name","jackMa");

        //获取转发器
        //通过HttpServletRequest获取
//        RequestDispatcher rrd = req.getRequestDispatcher("/nose");
        //通过ServletContext获取
//        RequestDispatcher srd = getServletContext().getRequestDispatcher("BigEar");

        //内部转发的两种方法
        //forward转发会清空前一个servlet的response数据
//        rrd.forward(req,resp);
        //include转发不会清空前一个servlet的response数据
//        rrd.include(req,resp);

    }
}
