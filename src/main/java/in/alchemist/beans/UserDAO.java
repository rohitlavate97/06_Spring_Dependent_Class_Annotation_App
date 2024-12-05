package in.alchemist.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("userDAO")
public class UserDAO implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Getting data from db");
        System.out.println("Storing into the redis");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Closing the connection");
    }


}
