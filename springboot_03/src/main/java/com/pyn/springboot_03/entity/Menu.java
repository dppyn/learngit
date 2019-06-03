package com.pyn.springboot_03.entity;

public class Menu {
    private Integer menu_id;    //菜单id

    private String menu_name;   //菜单名称

    private String menu_url;   //菜单的url

    private Integer menu_level;  //菜单级别

    private String menu_icon;   //菜单项

    private Integer menu_order;  //菜单顺序

    private Integer menu_status;  //菜单状态

    @Override
    public String toString() {
        return "Menu{" +
                "menu_id=" + menu_id +
                ", menu_name='" + menu_name + '\'' +
                ", menu_url='" + menu_url + '\'' +
                ", menu_level=" + menu_level +
                ", menu_icon='" + menu_icon + '\'' +
                ", menu_order=" + menu_order +
                ", menu_status=" + menu_status +
                '}';
    }

    public Integer getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(Integer menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    public Integer getMenu_level() {
        return menu_level;
    }

    public void setMenu_level(Integer menu_level) {
        this.menu_level = menu_level;
    }

    public String getMenu_icon() {
        return menu_icon;
    }

    public void setMenu_icon(String menu_icon) {
        this.menu_icon = menu_icon;
    }

    public Integer getMenu_order() {
        return menu_order;
    }

    public void setMenu_order(Integer menu_order) {
        this.menu_order = menu_order;
    }

    public Integer getMenu_status() {
        return menu_status;
    }

    public void setMenu_status(Integer menu_status) {
        this.menu_status = menu_status;
    }
}