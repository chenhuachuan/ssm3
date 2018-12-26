package com.baizhi.test;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestUserService extends BasicTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() {

        List<User> list = userService.queryAllUser();

        for (User u : list) {
            System.out.println(u);
        }

    }

}
