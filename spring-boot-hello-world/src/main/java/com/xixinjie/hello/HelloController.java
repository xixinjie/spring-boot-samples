package com.xixinjie.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xinjixi on 17/3/15.
 */

@Controller
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World via Spring Boot!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }
}
