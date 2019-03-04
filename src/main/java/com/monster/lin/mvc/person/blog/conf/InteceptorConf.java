package com.monster.lin.mvc.person.blog.conf;

import com.monster.lin.mvc.person.blog.Interceptor.SimpleInteceptor;
import com.monster.lin.mvc.person.blog.Interceptor.TestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * 类 <code>{类名称}</code>{此类功能描述}
 *
 * @author zangbao.lin
 * @version 2019/2/27
 * @since JDK 1.8
 */
@Configuration
public class InteceptorConf extends WebMvcConfigurationSupport {

    @Autowired
    private TestInterceptor testInterceptor;

    @Autowired
    private SimpleInteceptor simpleInteceptor;


    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        System.out.println("添加拦截器！");
        registry.addInterceptor(testInterceptor).addPathPatterns("/*");
        registry.addInterceptor(simpleInteceptor).addPathPatterns("/xiaomi");
        super.addInterceptors(registry);
    }
}
