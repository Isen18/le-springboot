package com.example.isen.service;

import com.example.isen.entry.User;
import com.example.isen.entry.UserExample;
import com.example.isen.mapper.UserMapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Isen
 * @date 2019/3/4 21:59
 * @since 1.0
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public Long add(User user) {
        userMapper.insert(user);
        return user.getId();
    }

    @Transactional
            (isolation = Isolation.SERIALIZABLE)
    public boolean update(User user, Long timeout){
        User record = userMapper.selectByPrimaryKey(user.getId());
        System.out.println(user.getName() + " " + record.getName());

        try {
            Thread.sleep(timeout);
//            System.out.println(System.currentTimeMillis() + " update " + timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        record = userMapper.selectByPrimaryKey(user.getId());
        System.out.println(user.getName() + " " + record.getName());

        int re = 0;
        try{
            re = userMapper.updateByPrimaryKeySelective(user);
            record = userMapper.selectByPrimaryKey(user.getId());
            System.out.println(user.getName() + " " + record.getName());
        }catch (Exception e){
            System.out.println(e);
            throw e;
        }finally {
            return re == 1;
        }
    }

    public boolean update2(User user, Long timeout) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=UTF-8", "root", "root");

        try {
            con.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        PreparedStatement preparedStatement = con.prepareStatement("update user set name=? where id=2");
        preparedStatement.setString(1, user.getName());

        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        preparedStatement.execute();

        con.commit();

        con.close();
        return true;
    }

    public User get(Long id) {
//        User user = userMapper.selectByPrimaryKey(id);
//        System.out.println(user);
//        user = userMapper.selectByPrimaryKey(id);
//        System.out.println(user);
//        userMapper.updateByPrimaryKeySelective(user);
//        user = userMapper.selectByPrimaryKey(id);
//        System.out.println(user);

        User user = userMapper.selectByPrimaryKey(id);
        user.setId(2L);
        userMapper.updateByPrimaryKeySelective(user);
        user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
