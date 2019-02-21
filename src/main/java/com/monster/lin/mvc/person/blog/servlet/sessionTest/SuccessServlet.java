package com.monster.lin.mvc.person.blog.servlet.sessionTest;

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
 * @version 2019/2/21
 * @since JDK 1.8
 */
@WebServlet(name = "successServlet",urlPatterns = {"/successServlet"})
public class SuccessServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String clientCode = req.getParameter("veriCode");
        String serverCode = (String)req.getSession().getAttribute("veriCode");

        if(clientCode != null && serverCode != null &&clientCode.equalsIgnoreCase(serverCode)) {
            System.out.println("验证码正确！");
        } else {
            System.out.println("验证码错误！！！");
        }

    }
}
