package com.framework.security.dto;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * Created by caihe on 2019/4/25.
 */
public class User {

    public interface UserSimpleView {
    }

    public interface UserDetailView extends UserSimpleView {
    }


    private Integer id;
    private String username;
    private String password;


    @JsonView(UserSimpleView.class)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @JsonView(UserSimpleView.class)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonView(UserDetailView.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
