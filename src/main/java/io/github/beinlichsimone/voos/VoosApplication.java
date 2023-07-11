package io.github.beinlichsimone.voos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class VoosApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoosApplication.class, args);
    }
}
