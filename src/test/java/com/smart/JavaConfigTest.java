package com.smart;

import com.smart.configuration.DaoConfig;
import com.smart.configuration.LogonService;
import com.smart.configuration.ServiceConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);

        //register multiple config class or can import into one config class
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //context.register(DaoConfig.class);
        //context.register(ServiceConfig.class);
        //refresh
        //context.refresh();
        LogonService service1 = context.getBean(LogonService.class);
        LogonService service2 = context.getBean(LogonService.class);
        service1.sayHello();

    }
}
