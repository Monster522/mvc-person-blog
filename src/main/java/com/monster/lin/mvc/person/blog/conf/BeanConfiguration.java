package com.monster.lin.mvc.person.blog.conf;

import com.monster.lin.mvc.person.blog.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 类 <code>{类名称}</code>{配置类}
 *
 * @author zangbao.lin
 * @version 2019/2/21
 * @since JDK 1.8
 */
@Configuration
public class BeanConfiguration {

    @Bean
    public User user() {
        return new User();
    }
}
