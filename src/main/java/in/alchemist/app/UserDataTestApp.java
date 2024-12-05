package in.alchemist.app;

import in.alchemist.AppConfig;
import in.alchemist.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDataTestApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service=context.getBean(UserService.class);
        service.getData();
        ConfigurableApplicationContext ctxt=(ConfigurableApplicationContext) context;
        ctxt.close();
        //this project is written for understanding @DependsOn annotations
    }
}
