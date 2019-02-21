package com.monster.lin.mvc.person.blog.servlet.cookieTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 类 <code>{CookieServlet}</code>{测试,获取或返回Cookie}
 *
 * @author zangbao.lin
 * @version 2019/1/31
 * @since JDK 1.8
 */
@WebServlet(name = "BigHand",urlPatterns = "/hand")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=UTF-8");

        //request获取Cookie
        Cookie[] cookieArr = req.getCookies();
        for(Cookie c : cookieArr){
            System.out.println("Cookie名称为："+c.getName());
            System.out.println("值为："+c.getValue());
        }

        //respose返回Cookie
        Cookie cookie = new Cookie("currentTime", System.currentTimeMillis()+"");
        cookie.setMaxAge(2*24*3600);
        resp.addCookie(cookie);

        PrintWriter out = resp.getWriter();
        out.write("cookieTest 测试！ ");

        out.flush();
        out.close();
    }
}
