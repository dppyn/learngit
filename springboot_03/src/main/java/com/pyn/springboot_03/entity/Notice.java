package com.pyn.springboot_03.entity;

import java.util.Date;

public class Notice {
    private Integer notice_id;  //公告id

    private String notice_title;  //公告抬头

    private String notice_content;  //公告内容

    private Date notice_create_time;  //公告创建时间

    private Date notice_update_time;  //公告更新时间

    private Integer notice_status;   //公告状态

    private Integer notice_order;    //公告顺序

    public Integer getNotice_id() {
        return notice_id;
    }

    public void setNotice_id(Integer notice_id) {
        this.notice_id = notice_id;
    }

    public String getNotice_title() {
        return notice_title;
    }

    public void setNotice_title(String notice_title) {
        this.notice_title = notice_title;
    }

    public String getNotice_content() {
        return notice_content;
    }

    public void setNotice_content(String notice_content) {
        this.notice_content = notice_content;
    }

    public Date getNotice_create_time() {
        return notice_create_time;
    }

    public void setNotice_create_time(Date notice_create_time) {
        this.notice_create_time = notice_create_time;
    }

    public Date getNotice_update_time() {
        return notice_update_time;
    }

    public void setNotice_update_time(Date notice_update_time) {
        this.notice_update_time = notice_update_time;
    }

    public Integer getNotice_status() {
        return notice_status;
    }

    public void setNotice_status(Integer notice_status) {
        this.notice_status = notice_status;
    }

    public Integer getNotice_order() {
        return notice_order;
    }

    public void setNotice_order(Integer notice_order) {
        this.notice_order = notice_order;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "notice_id=" + notice_id +
                ", notice_title='" + notice_title + '\'' +
                ", notice_content='" + notice_content + '\'' +
                ", notice_create_time=" + notice_create_time +
                ", notice_update_time=" + notice_update_time +
                ", notice_status=" + notice_status +
                ", notice_order=" + notice_order +
                '}';
    }
}