package com.smart.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DaoConfig {
    @Scope("prototype")
    @Bean
    public UserDao userDao(){
        return new UserDao();
    }

    @Bean
    public LoginDao loginDao(){
        return new LoginDao();
    }

}
