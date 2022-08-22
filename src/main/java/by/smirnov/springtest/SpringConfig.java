package by.smirnov.springtest;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("by.smirnov.springtest")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
