package com.example.isen.源码;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.propertyeditors.CustomDateEditor;
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
@RequestMapping("/ParamBand")
public class ParamBandController {
    private static final String OK = "ok";

    /**
     * curl http://localhost:8080/ParamBand/test?id=18&name=zhangsan
     */
    @RequestMapping("/test")
    public String test(HttpServletRequest request, Integer id, Student student){
        System.out.println("request=" + request);
        System.out.println("id=" + id);
        System.out.println("student=" + student);
        return OK;
    }

    /**
     * curl http://localhost:8080/ParamBand/test2?birthday=Sat, 01 May 2018 16:30:00 GMT
     * curl http://localhost:8080/ParamBand/test2?birthday=2018-01-01
     */
    @RequestMapping("/test2")
    public String test2(Date birthday){
        System.out.println("birthday=" + birthday);
        return OK;
    }

    /**
     * curl http://localhost:8080/ParamBand/test3?birthday=Sat, 01 May 2018 16:30:00 GMT
     * curl http://localhost:8080/ParamBand/test3?birthday=2018-01-01
     */
    @RequestMapping("/test3")
    public String test3(User user){
        System.out.println("user=" + user);
        return OK;
    }

    /**
     * 加入自定义属性编辑器。只能供当前controller使用
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        System.out.println("ParamBandController.initBinder");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
