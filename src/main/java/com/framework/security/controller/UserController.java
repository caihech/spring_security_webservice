package com.framework.security.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.framework.security.dto.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caihe on 2019/4/25.
 */
@RestController
public class UserController {


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @JsonView(User.UserSimpleView.class)
    public List<User> query() {

        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }

    @RequestMapping(value = "/users/{id:\\d+}", method = RequestMethod.GET)
    @JsonView(User.UserDetailView.class)
    public User getInfo(@PathVariable Integer id) {
        User user = null;
        if (id == 1) {
            user = new User();
            user.setUsername("admin");
            user.setPassword("123456");
        }
        return user;
    }
}
