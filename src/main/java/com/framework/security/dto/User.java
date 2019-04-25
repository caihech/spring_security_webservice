package com.framework.security.dto;

/**
 * Created by caihe on 2019/4/25.
 */
public class User {

    public String useranme;
    public String password;

    public String getUseranme() {
        return useranme;
    }

    public void setUseranme(String useranme) {
        this.useranme = useranme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
