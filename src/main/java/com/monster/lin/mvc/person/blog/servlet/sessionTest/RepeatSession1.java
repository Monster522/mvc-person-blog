package com.monster.lin.mvc.person.blog.servlet.sessionTest;

import com.monster.lin.mvc.person.blog.servlet.utils.TokenGenerate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 类 <code>{类名称}</code>{生成token并转发到登录页面}
 *
 * @author zangbao.lin
 * @version 2019/2/21
 * @since JDK 1.8
 */
@WebServlet(name = "repeatSession1",urlPatterns = {"/Rsession1"})
public class RepeatSession1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();

        //生成token并将token存入session
        String token = TokenGenerate.getInstance().makeToken();
        httpSession.setAttribute("token",token);
        System.out.println("Token值为："+token);
        req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req,resp);
    }
}
