package by.smirnov.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        Music music1 = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalPlayer = new MusicPlayer(music1);
        classicalPlayer.playMusic();
        context.close();
    }
}
