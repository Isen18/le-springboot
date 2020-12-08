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
@RequestMapping("/ParamBand5")
@SessionAttributes(value = {"color"})
public class ParamBandController5 {

    /**
     * curl http://localhost:8080/ParamBand5/test?color=red
     */
    @RequestMapping("/test")
    public @ResponseBody String test(Model model, String color){
        System.out.println("==============test==============");
        model.addAttribute("color", color);
        return "ok";
    }
}
