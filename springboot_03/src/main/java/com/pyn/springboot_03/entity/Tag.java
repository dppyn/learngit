package com.pyn.springboot_03.entity;

public class Tag {
    private Integer tag_id;  //标签id

    private String tag_name;  //标签名称

    private String tag_description; //标签描述

    private Integer tag_status;   //标签状态

    public Integer getTag_id() {
        return tag_id;
    }

    public void setTag_id(Integer tag_id) {
        this.tag_id = tag_id;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    public String getTag_description() {
        return tag_description;
    }

    public void setTag_description(String tag_description) {
        this.tag_description = tag_description;
    }

    public Integer getTag_status() {
        return tag_status;
    }

    public void setTag_status(Integer tag_status) {
        this.tag_status = tag_status;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tag_id=" + tag_id +
                ", tag_name='" + tag_name + '\'' +
                ", tag_description='" + tag_description + '\'' +
                ", tag_status=" + tag_status +
                '}';
    }
}