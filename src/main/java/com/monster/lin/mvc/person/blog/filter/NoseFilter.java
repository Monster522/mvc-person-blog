package com.monster.lin.mvc.person.blog.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 类 <code>{类名称}</code>{过滤器}
 *
 * @author zangbao.lin
 * @version 2019/1/31
 * @since JDK 1.8
 */
//@WebFilter(filterName = "eyes",urlPatterns = "/*")
public class NoseFilter implements Filter {
    //初始化
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化！");
    }

    //处理过滤代码
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        HttpServletResponse httpServletResponse = (HttpServletResponse)response;

        System.out.println("进入处理...");
        String username = httpServletRequest.getParameter("user");

        if(username.equals("jackMa")) {
            System.out.println("这是杰克马");
        }

        //chain将filter传回过滤链
        chain.doFilter(request,response);
    }

    //销毁
    public void destroy() {
        System.out.println("过滤器销毁！");
    }


}
