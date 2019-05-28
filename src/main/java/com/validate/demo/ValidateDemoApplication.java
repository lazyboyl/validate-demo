package com.validate.demo;

import com.didispace.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2Doc
public class ValidateDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValidateDemoApplication.class, args);
    }

}
