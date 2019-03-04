package com.monster.lin.mvc.person.blog.filter;

import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 类 <code>{类名称}</code>{字节编码过滤器}
 *
 * @author zangbao.lin
 * @version 2019/2/26
 * @since JDK 1.8
 */
//@WebFilter(filterName = "characterFilter",urlPatterns = "/rove")
public class CharacterFilter extends CharacterEncodingFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("编码过滤器开始工作...");
        super.doFilterInternal(request, response, filterChain);

    }
}
