package com.monster.lin.mvc.person.blog.servlet.cookieTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类 <code>{TlastTimeCookie}</code>{通过Cookie记录用户上次的访问时间}
 *
 * @author zangbao.lin
 * @version 2019/2/18
 * @since JDK 1.8
 */
@WebServlet(name = "AccessTime",urlPatterns = "/accessTime")
public class TlastTimeCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=UTF-8");
        String lastTime = "";

        //获取Cookie
        Cookie[] cookies = req.getCookies();
        for(Cookie c : cookies){
            if(c.getName().equals("currentTime")){
                lastTime = c.getValue();
            }
        }

        //当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(new Date());

        //返回Cookie
        Cookie cookie = new Cookie("currentTime",currentTime);
        cookie.setMaxAge(2*24*3600);
        resp.addCookie(cookie);

        PrintWriter out = resp.getWriter();
        out.write("用户上次访问的时间为： "+lastTime);

        out.flush();
        out.close();
    }
}
