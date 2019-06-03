package com.pyn.springboot_03.entity;

public class Category {
    private Integer category_id;       //类别id

    private Integer category_pid;     //类别pid

    private String category_name;    //类别名称

    private String category_description;  //类别描述

    private Integer category_order;    //类别顺序

    private String category_icon;   //分类图标

    private Integer category_status;  //分类状态

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Integer getCategory_pid() {
        return category_pid;
    }

    public void setCategory_pid(Integer category_pid) {
        this.category_pid = category_pid;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_description() {
        return category_description;
    }

    public void setCategory_description(String category_description) {
        this.category_description = category_description;
    }

    public Integer getCategory_order() {
        return category_order;
    }

    public void setCategory_order(Integer category_order) {
        this.category_order = category_order;
    }

    public String getCategory_icon() {
        return category_icon;
    }

    public void setCategory_icon(String category_icon) {
        this.category_icon = category_icon;
    }

    public Integer getCategory_status() {
        return category_status;
    }

    public void setCategory_status(Integer category_status) {
        this.category_status = category_status;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", category_pid=" + category_pid +
                ", category_name='" + category_name + '\'' +
                ", category_description='" + category_description + '\'' +
                ", category_order=" + category_order +
                ", category_icon='" + category_icon + '\'' +
                ", category_status=" + category_status +
                '}';
    }

}