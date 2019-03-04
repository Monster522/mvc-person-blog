package com.monster.lin.mvc.person.blog.controller;

import com.monster.lin.mvc.person.blog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 类 <code>{类名称}</code>{springMVC处理类}
 *
 * @author zangbao.lin
 * @version 2019/2/21
 * @since JDK 1.8
 */
@Controller
public class RoveController {

    @Autowired
    private User user;

    @ResponseBody
    @RequestMapping("/xiaomi")
    public Map<String,Object> success(String name) throws IOException {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("brand","XIAOMI");
        map.put("corlor","blue");
        return map;

//        response.setContentType("application/json;charset=UTF-8");
//        response.getWriter().write("ioped");
    }


    @ResponseBody
    @RequestMapping("/honer")
    public Map<String,Object> honer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("brand","HONER");
        map.put("corlor","white");
        return map;

    }


}
