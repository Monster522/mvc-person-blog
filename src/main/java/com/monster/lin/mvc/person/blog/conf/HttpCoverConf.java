package com.monster.lin.mvc.person.blog.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/**
 * 类 <code>{类名称}</code>{此类功能描述}
 *
 * @author zangbao.lin
 * @version 2019/3/4
 * @since JDK 1.8
 */

@Configuration
public class HttpCoverConf extends WebMvcConfigurationSupport {
    //1.定义消息转换器，使用已有的或者自定义都可以。
    @Bean
    public ByteArrayHttpMessageConverter getByteConverter(){
        return new ByteArrayHttpMessageConverter();
    }

    //2.注册消息转换器,会覆盖掉原有的消息转换器，需要调用父类注册才不会覆盖。
    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(getByteConverter());
        super.configureMessageConverters(converters);
    }

    //3.注册消息转换器，不会覆盖掉原有，仅仅是往已有的消息转换器链表中新添加一个。
    @Override
    protected void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(getByteConverter());
        super.extendMessageConverters(converters);
    }
}
