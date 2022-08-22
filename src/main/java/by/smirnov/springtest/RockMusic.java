package by.smirnov.springtest;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock'n'Roll is Dead";
    }
}
