package com.monster.lin.mvc.person.blog.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

/**
 * 类 <code>{类名称}</code>{通过注解代替xml文件中bean注入}
 *
 * @author zangbao.lin
 * @version 2019/2/26
 * @since JDK 1.8
 */
//@Configuration
public class CustomConf {

    @Bean
    public MyWebBindingInit getMyWebBindingInit(){
        return new MyWebBindingInit();
    }

    @Bean
    public RequestMappingHandlerAdapter getAD() {
        RequestMappingHandlerAdapter rm = new RequestMappingHandlerAdapter();
        rm.setWebBindingInitializer(getMyWebBindingInit());
        return rm;
    }


}
