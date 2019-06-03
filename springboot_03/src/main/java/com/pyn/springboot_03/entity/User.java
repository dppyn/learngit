package com.pyn.springboot_03.entity;

import java.util.Date;

public class User {
    private Integer user_id;   //用户id

    private String user_name;  //用户名称

    private String user_pass;  //用户密码

    private String user_nickname;  //用户昵称

    private String user_email;  //用户email

    private String user_url;  //用户url

    private String user_avatar;  //用户头像

    private String user_last_login_ip;  //用户最近单点登录ip

    private Date user_register_time;  //用户注册时间

    private Date user_last_login_time;  //用户最近一次登录时间

    private Integer user_status;    //用户状态

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_pass='" + user_pass + '\'' +
                ", user_nickname='" + user_nickname + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_url='" + user_url + '\'' +
                ", user_avatar='" + user_avatar + '\'' +
                ", user_last_login_ip='" + user_last_login_ip + '\'' +
                ", user_register_time=" + user_register_time +
                ", user_last_login_time=" + user_last_login_time +
                ", user_status=" + user_status +
                '}';
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_url() {
        return user_url;
    }

    public void setUser_url(String user_url) {
        this.user_url = user_url;
    }

    public String getUser_avatar() {
        return user_avatar;
    }

    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
    }

    public String getUser_last_login_ip() {
        return user_last_login_ip;
    }

    public void setUser_last_login_ip(String user_last_login_ip) {
        this.user_last_login_ip = user_last_login_ip;
    }

    public Date getUser_register_time() {
        return user_register_time;
    }

    public void setUser_register_time(Date user_register_time) {
        this.user_register_time = user_register_time;
    }

    public Date getUser_last_login_time() {
        return user_last_login_time;
    }

    public void setUser_last_login_time(Date user_last_login_time) {
        this.user_last_login_time = user_last_login_time;
    }

    public Integer getUser_status() {
        return user_status;
    }

    public void setUser_status(Integer user_status) {
        this.user_status = user_status;
    }
}