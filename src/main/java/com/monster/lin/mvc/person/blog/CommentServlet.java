package com.monster.lin.mvc.person.blog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 类 <code>{类名称}</code>{Servlet注解}
 *
 * @author zangbao.lin
 * @version 2019/1/30
 * @since JDK 1.8
 */
@WebServlet(name = "BigNose",urlPatterns = {"/nose"})
public class CommentServlet extends HttpServlet {
    private static final long serialVersionUID = -1915463532411657451L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.write("The Greate China! " + req.getAttribute("name"));

        out.flush();
        out.close();
    }
}

