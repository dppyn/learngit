package com.pyn.springboot_03.entity;

import java.util.Date;

public class Comment {
    private Integer comment_id;   //评论id

    private Integer comment_pid;  //评论pid

    private String comment_pname;  //评论父姓名

    private Integer comment_article_id; //评论文章id

    private String comment_author_name;  //评论者

    private String comment_author_email;  //评论者邮箱

    private String comment_author_url;   //评论者url

    private String comment_content;    //评论

    private String comment_agent;  //评论代理

    private String comment_ip;   //评论者ip

    private Date comment_create_time;  //评论时间

    private Integer comment_role;     //评论角色

    private Integer comment_status;   //评论状态

    @Override
    public String toString() {
        return "Comment{" +
                "comment_id=" + comment_id +
                ", comment_pid=" + comment_pid +
                ", comment_pname='" + comment_pname + '\'' +
                ", comment_article_id=" + comment_article_id +
                ", comment_author_name='" + comment_author_name + '\'' +
                ", comment_author_email='" + comment_author_email + '\'' +
                ", comment_author_url='" + comment_author_url + '\'' +
                ", comment_content='" + comment_content + '\'' +
                ", comment_agent='" + comment_agent + '\'' +
                ", comment_ip='" + comment_ip + '\'' +
                ", comment_create_time=" + comment_create_time +
                ", comment_role=" + comment_role +
                ", comment_status=" + comment_status +
                '}';
    }

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public Integer getComment_pid() {
        return comment_pid;
    }

    public void setComment_pid(Integer comment_pid) {
        this.comment_pid = comment_pid;
    }

    public String getComment_pname() {
        return comment_pname;
    }

    public void setComment_pname(String comment_pname) {
        this.comment_pname = comment_pname;
    }

    public Integer getComment_article_id() {
        return comment_article_id;
    }

    public void setComment_article_id(Integer comment_article_id) {
        this.comment_article_id = comment_article_id;
    }

    public String getComment_author_name() {
        return comment_author_name;
    }

    public void setComment_author_name(String comment_author_name) {
        this.comment_author_name = comment_author_name;
    }

    public String getComment_author_email() {
        return comment_author_email;
    }

    public void setComment_author_email(String comment_author_email) {
        this.comment_author_email = comment_author_email;
    }

    public String getComment_author_url() {
        return comment_author_url;
    }

    public void setComment_author_url(String comment_author_url) {
        this.comment_author_url = comment_author_url;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public String getComment_agent() {
        return comment_agent;
    }

    public void setComment_agent(String comment_agent) {
        this.comment_agent = comment_agent;
    }

    public String getComment_ip() {
        return comment_ip;
    }

    public void setComment_ip(String comment_ip) {
        this.comment_ip = comment_ip;
    }

    public Date getComment_create_time() {
        return comment_create_time;
    }

    public void setComment_create_time(Date comment_create_time) {
        this.comment_create_time = comment_create_time;
    }

    public Integer getComment_role() {
        return comment_role;
    }

    public void setComment_role(Integer comment_role) {
        this.comment_role = comment_role;
    }

    public Integer getComment_status() {
        return comment_status;
    }

    public void setComment_status(Integer comment_status) {
        this.comment_status = comment_status;
    }
}