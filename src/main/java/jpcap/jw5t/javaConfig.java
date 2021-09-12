package jpcap.jw5t;

import jpcap.jw5t.main.hello;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {

    @Bean
    hello hello() {
        return hello();
    }
}
