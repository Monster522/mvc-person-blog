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
@WebServlet(name = "repeatSession2",urlPatterns = {"/Rsession2"})
public class RepeatSession2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if(!isRequestSubmit(req)){
            req.getSession().removeAttribute("token");
            System.out.println("正在处理提交请求...");
            req.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(req,resp);
        }

        System.out.println("请不要重复提交！");
    }

    private boolean isRequestSubmit(HttpServletRequest req) {
        String clienToken = req.getParameter("token");
        if(clienToken == null) {
            return true;
        }

        String serverToken = (String) req.getSession().getAttribute("token");
        if(serverToken == null) {
            return true;
        }

        if(!clienToken.equals(serverToken)) {
            return true;
        }

        return false;
    }
}
