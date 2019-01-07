package com.example.isen.源码;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Isen
 * @date 2019/1/3 9:26
 * @since 1.0
 */
@Controller
@RequestMapping("/ParamBand3")
public class ParamBandController3 {
    private static final String OK = "ok";

    /**
     * curl http://localhost:8080/ParamBand3/test?name=zhangsan&age=18
     */
    @RequestMapping("/test")
    public String test(HttpServletRequest httpServletRequest, String name){
        System.out.println("httpServletRequest=" + httpServletRequest + " name=" + name);
        return OK;
    }

    /**
     * curl http://localhost:8080/ParamBand3/test2?name=zhangsan
     */
    @RequestMapping("/test2")
    public String test2(Student student){
        System.out.println("student=" + student);
        return OK;
    }

    /**
     * curl http://localhost:8080/ParamBand3/test3?name=zhangsan
     */
    @RequestMapping("/test3")
    public String test3(String name, Student student){
        System.out.println("name=" + name + " student=" + student);
        return OK;
    }

    /**
     * curl http://localhost:8080/ParamBand3/test4?name=zhangsan
     */
    @RequestMapping("/test4")
    public String test4(@RequestParam Student student){
        System.out.println("student=" + student);
        return OK;
    }

    /**
     * curl http://localhost:8080/Param Band3/test5?name=zhangsan
     */
    @RequestMapping("/test5")
    public @ResponseBody Student test5(@RequestBody Student student){
        System.out.println("student=" + student);
        return student;
    }
}
