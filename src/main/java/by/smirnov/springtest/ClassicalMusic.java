package by.smirnov.springtest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music{

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doin' my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doin' my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
