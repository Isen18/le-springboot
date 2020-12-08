package com.example.isen.源码;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;

/**
 * 注入自定义的属性编辑器——方式2
 * 需要在xml中配置MyWebBindingInitializer到RequestMappingHandlerAdapter的webBindingInitializer
 *
 * @author Isen
 * @date 2019/1/4 22:18
 * @since 1.0
 */
//public class MyWebBindingInitializer implements WebBindingInitializer {
//
//    @Override
//    public void initBinder(WebDataBinder binder) {
//        binder.registerCustomEditor(User.class, new CustomUserEditor());
//    }
//}
