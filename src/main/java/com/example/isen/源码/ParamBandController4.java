package com.example.isen.源码;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * @author Isen
 * @date 2019/1/3 9:26
 * @since 1.0
 */
@Controller
@RequestMapping("/ParamBand4")
@SessionAttributes(value = {"name", "password"}, types = {Integer.class})
public class ParamBandController4 {

    /**
     * curl http://localhost:8080/ParamBand4/test
     */
    @RequestMapping("/test")
    public String test(Model model){
        System.out.println("==============test==============");
        model.addAttribute("name", "isen");
        model.addAttribute("password", "123");
        model.addAttribute("age", 18);
        return "redirect:test2";
//        return "forward:test2";
    }

    /**
     * curl http://localhost:8080/ParamBand4/test2?age=12
     */
    @RequestMapping("/test2")
    public String test2(@ModelAttribute String name, @ModelAttribute Integer age, ModelMap modelMap, SessionStatus sessionStatus){
        System.out.println("==============test2==============");
        System.out.println(name);
        System.out.println(age);
        System.out.println(modelMap.get("age"));
        sessionStatus.setComplete();
        return "redirect:test3";
    }

    /**
     * curl http://localhost:8080/ParamBand4/test3
     */
    @RequestMapping("/test3")
    public @ResponseBody String test3(@ModelAttribute String name, @ModelAttribute String color){
        System.out.println("==============test3==============");
        System.out.println(name);
        System.out.println(color);
        return "ok";
    }
}
