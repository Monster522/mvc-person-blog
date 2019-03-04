package com.monster.lin.mvc.person.blog.controller;

import com.monster.lin.mvc.person.blog.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.util.Map;

/**
 * 类 <code>{类名称}</code>{自定义类型转换器，自定义编辑器}
 *
 * @author zangbao.lin
 * @version 2019/2/26
 * @since JDK 1.8
 */
@Controller
public class CustomEdiController {

    @InitBinder
    public void customBind(WebDataBinder binder) {
        /**
            实现自定义编辑器
            1.通过PropertyEditorSupport实例化PropertyEditor对象
            2.重写setAsText方法和getAsText方法
         **/
        PropertyEditor propertyEditor = new PropertyEditorSupport(){
            //setAsText方法是将字符串类型转换为对象
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                User user = new User(text,"black");
                setValue(user);
            }

            //getAsText方法是将对象作为字符串来返回
            @Override
            public String getAsText() {
                User user = (User)getValue();
                return user.getUserName();
            }
        };

        binder.registerCustomEditor(User.class,propertyEditor);

    }

    @ResponseBody
    @RequestMapping("/custom")
    public User custom(@RequestParam("userName")User user) {
        System.out.println(user.toString());
        return user;
    }
}
