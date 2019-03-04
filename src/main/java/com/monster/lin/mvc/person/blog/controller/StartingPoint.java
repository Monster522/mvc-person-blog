package com.monster.lin.mvc.person.blog.controller;

import com.monster.lin.mvc.person.blog.conf.BeanConfiguration;
import com.monster.lin.mvc.person.blog.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类 <code>{类名称}</code>{此类功能描述}
 *
 * @author zangbao.lin
 * @version 2019/2/21
 * @since JDK 1.8
 */

public class StartingPoint {
    public static void main(String[] args){
        //配置文件加载容器
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        //注解类加载容器
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfiguration.class);

        //实例化对象
        User user = (User) context.getBean("user");

        System.out.println(user.toString());
    }

}
