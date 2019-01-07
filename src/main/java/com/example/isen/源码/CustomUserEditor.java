package com.example.isen.源码;

import java.beans.PropertyEditorSupport;

/**
 * @author Isen
 * @date 2019/1/4 22:14
 * @since 1.0
 */
public class CustomUserEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("CustomUserEditor.setAsText");
        if(text.indexOf(",") > 0) {
            User user = new User();
            String[] arr = text.split(",");
            user.setName(arr[0]);
            user.setAge(Integer.parseInt(arr[1]));
            setValue(user);
        } else {
            throw new IllegalArgumentException("user param is error");
        }
    }
}
