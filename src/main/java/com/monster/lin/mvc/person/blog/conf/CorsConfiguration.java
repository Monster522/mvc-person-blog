package com.monster.lin.mvc.person.blog.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 类 <code>{类名称}</code>{此类功能描述}
 *
 * @author zangbao.lin
 * @version 2019/2/26
 * @since JDK 1.8
 */
@Configuration
//@EnableWebMvc
public class CorsConfiguration extends WebMvcConfigurationSupport{

    //配置跨域
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/*")//允许跨域的接口
                .allowedOrigins("http://domain2.com")//所允许的跨域地址
                .allowedMethods("PUT", "DELETE")//方法
                .allowedHeaders("Content-Type")//头部
                .exposedHeaders("header1", "header2")
                .allowCredentials(true).maxAge(3600);//允许自动关闭

        super.addCorsMappings(registry);
    }
}
