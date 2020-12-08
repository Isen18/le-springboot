package com.example.isen.controller;

import com.example.isen.entry.User;
import com.example.isen.service.UserService;
import java.sql.SQLException;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Isen
 * @date 2019/3/4 21:57
 * @since 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * curl http://localhost:8080/user/add
     * @return
     */
    @RequestMapping("/add")
    public Long add(){
        User user = new User();
        user.setName("zhangsan");
        user.setAge((short)12);

        return userService.add(user);
    }

    /**
     * curl http://localhost:8080/user/update?name=2&timeout=1000
     * @return
     */
    @RequestMapping("/update")
    public boolean update(String name, Long timeout) throws SQLException {
        User user = new User();
        user.setId(2L);
        user.setName(name);
        user.setAge((short)12);

        return userService.update(user, timeout);
//        return userService.update2(user, timeout);
    }

    /**
     * curl http://localhost:8080/user/get?id=1
     * @return
     */
    @RequestMapping("/get")
    public User get(Long id){
        return userService.get(id);
    }
}
