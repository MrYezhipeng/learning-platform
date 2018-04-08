package com.hhit.learn.mapper;

import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: learn
 * @description: 用户的Mapper测试类
 * @author: GeekYe
 * @create: 2018-04-08 13:15
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Test
    public void saveUser(){
        userMapper.saveUser("2014123008","叶志鹏","yezhipeng","电子学院","电气142");

    }
}
