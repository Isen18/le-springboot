package com.example.isen;

import com.example.isen.config.StudentConfig;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Isen
 * @date 2018/10/25 16:24
 * @since 1.0
 */
@RestController
public class HelloController {

    @Resource
    private StudentConfig studentConfig;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("name=" + studentConfig.getName() + " age=" + studentConfig.getAge());
        return "Hello Spring Boot!";
    }
}
