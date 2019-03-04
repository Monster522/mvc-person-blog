package com.monster.lin.mvc.person.blog.controller;

import com.monster.lin.mvc.person.blog.entity.Group;
import com.monster.lin.mvc.person.blog.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.lang.reflect.Field;

/**
 * 类 <code>{类名称}</code>{此类功能描述}
 *
 * @author zangbao.lin
 * @version 2019/3/1
 * @since JDK 1.8
 */
@Controller
public class StringController {

    @ResponseBody
    @RequestMapping(value = "/readString")
    public String readString(String name) {
        return "输入的名字为："+name;
    }


    @ResponseBody
    @RequestMapping(value = "/validString")
    public String validString(@Validated(Group.class) User user, BindingResult bindingResult, Model model) {
        //BindingResult可以获取返回结果中的错误信息
        if(bindingResult.hasErrors()) {
            System.out.println("客户端的请求数据异常，异常数据如下：");
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                //打印异常字段以及异常信息
                System.out.println(fieldError.getField()+" : "+fieldError.getDefaultMessage());
            }
            return "凉凉";
        }
        return "输入的名字为："+ user.getUserName();
    }
}
