package com.myth.config;

import com.myth.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author myth
 * @Date 2020-06-21 18:53
 */
@Configuration //代表一个配置类
@ComponentScan("com.myth.pojo")
public class AppConfig {

    public User user(){
        return new User();
    }
}
