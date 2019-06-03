package com.pyn.springboot_03.entity;

import java.util.Date;

public class Link {
    private Integer link_id;    //链接id

    private String link_url;   //链接的url

    private String link_name;  //链接名称

    private String link_image;  //链接图片

    private String link_description;  //链接描述

    private String link_owner_nickname;  //创建链接者名字

    private String link_owner_contact;   //创建链接者联系方式

    private Date link_update_time;  //链接创建时间

    private Date link_create_time;  //链接更新时间

    private Integer link_order;    //链接顺序

    private Integer link_status;  //链接状态

    @Override
    public String toString() {
        return "Link{" +
                "link_id=" + link_id +
                ", link_url='" + link_url + '\'' +
                ", link_name='" + link_name + '\'' +
                ", link_image='" + link_image + '\'' +
                ", link_description='" + link_description + '\'' +
                ", link_owner_nickname='" + link_owner_nickname + '\'' +
                ", link_owner_contact='" + link_owner_contact + '\'' +
                ", link_update_time=" + link_update_time +
                ", link_create_time=" + link_create_time +
                ", link_order=" + link_order +
                ", link_status=" + link_status +
                '}';
    }

    public Integer getLink_id() {
        return link_id;
    }

    public void setLink_id(Integer link_id) {
        this.link_id = link_id;
    }

    public String getLink_url() {
        return link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }

    public String getLink_name() {
        return link_name;
    }

    public void setLink_name(String link_name) {
        this.link_name = link_name;
    }

    public String getLink_image() {
        return link_image;
    }

    public void setLink_image(String link_image) {
        this.link_image = link_image;
    }

    public String getLink_description() {
        return link_description;
    }

    public void setLink_description(String link_description) {
        this.link_description = link_description;
    }

    public String getLink_owner_nickname() {
        return link_owner_nickname;
    }

    public void setLink_owner_nickname(String link_owner_nickname) {
        this.link_owner_nickname = link_owner_nickname;
    }

    public String getLink_owner_contact() {
        return link_owner_contact;
    }

    public void setLink_owner_contact(String link_owner_contact) {
        this.link_owner_contact = link_owner_contact;
    }

    public Date getLink_update_time() {
        return link_update_time;
    }

    public void setLink_update_time(Date link_update_time) {
        this.link_update_time = link_update_time;
    }

    public Date getLink_create_time() {
        return link_create_time;
    }

    public void setLink_create_time(Date link_create_time) {
        this.link_create_time = link_create_time;
    }

    public Integer getLink_order() {
        return link_order;
    }

    public void setLink_order(Integer link_order) {
        this.link_order = link_order;
    }

    public Integer getLink_status() {
        return link_status;
    }

    public void setLink_status(Integer link_status) {
        this.link_status = link_status;
    }
}