package com.example.isen.源码;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Isen
 * @date 2019/1/4 21:44
 * @since 1.0
 */
@RestController
@RequestMapping(value = "/FormObj")
public class FormObjController {
    private static final String OK = "ok";

    /**
     * curl http://localhost:8080/FormObj/test1?user.name=zhangsan&user.age=18
     */
    @RequestMapping("/test1")
    public String test1(@FormObj User user) {
        System.out.println(user);
        return OK;
    }

    /**
     * curl http://localhost:8080/FormObj/test2?u.name=zhangsan&u.age=18
     */
    @RequestMapping("/test2")
    public String test2(@FormObj("u") User user) {
        System.out.println(user);
        return OK;
    }

    /**
     * curl http://localhost:8080/FormObj/test3?u.name=zhangsan&u.age=18
     */
    @RequestMapping("/test3")
    public String test3(@FormObj(value = "u", show = false) User user) {
        System.out.println(user);
        return OK;
    }
}
