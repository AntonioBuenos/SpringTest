package by.smirnov.springtest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
