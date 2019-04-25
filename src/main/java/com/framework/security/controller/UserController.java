package com.framework.security.controller;

import com.framework.security.dto.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caihe on 2019/4/25.
 */
@RestController
public class UserController {


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> query() {

        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }

    @RequestMapping(value = "/users/username", method = RequestMethod.GET)
    public User queryByUsername(@RequestParam String username) {
        User user = null;
        if (username.equals("admin")) {
            user = new User();
            user.setUseranme("admin");
            user.setPassword("123456");
        }
        return user;
    }
}
