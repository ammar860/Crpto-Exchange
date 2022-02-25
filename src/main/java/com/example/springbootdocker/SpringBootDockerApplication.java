package com.example.springbootdocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@SpringBootApplication
public class SpringBootDockerApplication {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }

}
