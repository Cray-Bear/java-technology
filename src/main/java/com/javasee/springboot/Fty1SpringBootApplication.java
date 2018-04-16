package com.javasee.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class Fty1SpringBootApplication {

    @RequestMapping("/")
    public String index(){
        return "Fty1SpringBootApplication.";
    }

    public static void main(String[] args) {
        SpringApplication.run(Fty1SpringBootApplication.class,args);
    }
}
