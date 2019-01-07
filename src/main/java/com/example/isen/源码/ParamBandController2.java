package com.example.isen.源码;

import java.util.Date;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Isen
 * @date 2019/1/3 9:26
 * @since 1.0
 */
@RestController
@RequestMapping("/ParamBand2")
public class ParamBandController2 {
    private static final String OK = "ok";

    /**
     * curl http://localhost:8080/ParamBand2/test?birthday=Sat, 01 May 2018 16:30:00 GMT
     * curl http://localhost:8080/ParamBand2/test?birthday=2018-01-01
     */
    @RequestMapping("/test")
    public String test(Date birthday){
        System.out.println("birthday=" + birthday);
        return OK;
    }

    /**
     * curl http://localhost:8080/ParamBand2/test2?user=zhagnsan,18
     */
    @RequestMapping("/test2")
    public String test2(Users users){
        System.out.println("users=" + users);
        return OK;
    }

    /**
     * curl http://localhost:8080/ParamBand2/test3?user=zhagnsan,18
     */
    // FIXME isen  为毛不行？
    @RequestMapping("/test3")
    public String test2(User user){
        System.out.println("user=" + user);
        return OK;
    }

    /**
     * 注入自定义的属性编辑器——方式1
     */
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        System.out.println("ParamBandController2.initBinder");
//        binder.registerCustomEditor(User.class, new CustomUserEditor());
//    }
}
