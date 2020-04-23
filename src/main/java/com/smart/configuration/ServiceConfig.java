package com.smart.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(DaoConfig.class)
public class ServiceConfig {

    @Autowired
    private DaoConfig daoConfig;

    @Bean
    public LogonService logonService(){
        LogonService service = new LogonService();
        service.setUserDao(daoConfig.userDao());
        //Test for userDao scope
        System.out.println(daoConfig.userDao().hashCode());
        System.out.println(daoConfig.userDao().hashCode());
        service.setLoginDao(daoConfig.loginDao());
        return service;
    }
}
