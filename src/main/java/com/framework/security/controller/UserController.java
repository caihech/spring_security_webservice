package com.framework.security.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.framework.security.dto.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by caihe on 2019/4/25.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @PostMapping
    @JsonView(User.UserSimpleView.class)
    public User create(@Valid @RequestBody User user, BindingResult errors) {

        if (errors.hasErrors()) {
            errors.getAllErrors().stream().forEach(error -> System.out.println(error.getDefaultMessage()));
        }

        user.setId(1);
        return user;
    }


    @GetMapping
    @JsonView(User.UserSimpleView.class)
    public List<User> query() {

        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }

    @GetMapping(value = "/{id:\\d+}")
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
