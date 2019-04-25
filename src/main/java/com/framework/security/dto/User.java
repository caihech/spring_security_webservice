package com.framework.security.dto;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.Date;

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
    private Date brithday;


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



    @JsonView(UserSimpleView.class)
    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

}
