package jpcap.jw5t;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "jpcap.jw5t.information")
@ComponentScan(basePackages = "jpcap.jw5t.main")
public class javaConfig {

}
