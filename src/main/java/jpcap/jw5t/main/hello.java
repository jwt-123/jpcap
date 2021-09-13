package jpcap.jw5t.main;


import lombok.Data;
import org.apache.camel.spi.annotations.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class hello {

    private String  hello;
    public hello(){
        System.out.println("----------inti----------");
    }

}
