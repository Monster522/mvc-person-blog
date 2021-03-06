package com.monster.lin.mvc.person.blog.servlet.sessionTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 类 <code>{类名称}</code>{此类功能描述}
 *
 * @author zangbao.lin
 * @version 2019/2/19
 * @since JDK 1.8
 */
@WebServlet(name = "login",urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //获取Session
        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("username",username);

        req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req,resp);

    }
}
