package com.example.isen.源码;

/**
 * @author Isen
 * @date 2019/1/4 22:39
 * @since 1.0
 */
public class Users {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Users{" +
                "user=" + user +
                '}';
    }
}
