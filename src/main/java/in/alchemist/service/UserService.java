package in.alchemist.service;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@DependsOn("userDAO")
public class UserService {
    public void getData(){
        System.out.println("Getting data form redis");
    }
}
