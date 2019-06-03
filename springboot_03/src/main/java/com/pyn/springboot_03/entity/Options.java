package com.pyn.springboot_03.entity;

public class Options {
    private Integer option_id;    //站点id

    private String option_site_title;  //  站点名称

    private String option_site_descrption; //站点描述

    private String option_meta_descrption; //站点首页描述

    private String option_meta_keyword; //首页关键词

    private String option_aboutsite_avatar; //关于站点头像

    private String option_aboutsite_title;  //关于站点抬头

    private String option_aboutsite_content; //关于站点内容

    private String option_aboutsite_wechat;  //关于站点微信

    private String option_aboutsite_qq;   //关于站点qq

    private String option_aboutsite_github;  //关于站点github

    private String option_aboutsite_weibo;  //关于站点微博

    private String option_tongji;    //

    private Integer option_status;  //站点状态

    @Override
    public String toString() {
        return "Options{" +
                "option_id=" + option_id +
                ", option_site_title='" + option_site_title + '\'' +
                ", option_site_descrption='" + option_site_descrption + '\'' +
                ", option_meta_descrption='" + option_meta_descrption + '\'' +
                ", option_meta_keyword='" + option_meta_keyword + '\'' +
                ", option_aboutsite_avatar='" + option_aboutsite_avatar + '\'' +
                ", option_aboutsite_title='" + option_aboutsite_title + '\'' +
                ", option_aboutsite_content='" + option_aboutsite_content + '\'' +
                ", option_aboutsite_wechat='" + option_aboutsite_wechat + '\'' +
                ", option_aboutsite_qq='" + option_aboutsite_qq + '\'' +
                ", option_aboutsite_github='" + option_aboutsite_github + '\'' +
                ", option_aboutsite_weibo='" + option_aboutsite_weibo + '\'' +
                ", option_tongji='" + option_tongji + '\'' +
                ", option_status=" + option_status +
                '}';
    }

    public Integer getOption_id() {
        return option_id;
    }

    public void setOption_id(Integer option_id) {
        this.option_id = option_id;
    }

    public String getOption_site_title() {
        return option_site_title;
    }

    public void setOption_site_title(String option_site_title) {
        this.option_site_title = option_site_title;
    }

    public String getOption_site_descrption() {
        return option_site_descrption;
    }

    public void setOption_site_descrption(String option_site_descrption) {
        this.option_site_descrption = option_site_descrption;
    }

    public String getOption_meta_descrption() {
        return option_meta_descrption;
    }

    public void setOption_meta_descrption(String option_meta_descrption) {
        this.option_meta_descrption = option_meta_descrption;
    }

    public String getOption_meta_keyword() {
        return option_meta_keyword;
    }

    public void setOption_meta_keyword(String option_meta_keyword) {
        this.option_meta_keyword = option_meta_keyword;
    }

    public String getOption_aboutsite_avatar() {
        return option_aboutsite_avatar;
    }

    public void setOption_aboutsite_avatar(String option_aboutsite_avatar) {
        this.option_aboutsite_avatar = option_aboutsite_avatar;
    }

    public String getOption_aboutsite_title() {
        return option_aboutsite_title;
    }

    public void setOption_aboutsite_title(String option_aboutsite_title) {
        this.option_aboutsite_title = option_aboutsite_title;
    }

    public String getOption_aboutsite_content() {
        return option_aboutsite_content;
    }

    public void setOption_aboutsite_content(String option_aboutsite_content) {
        this.option_aboutsite_content = option_aboutsite_content;
    }

    public String getOption_aboutsite_wechat() {
        return option_aboutsite_wechat;
    }

    public void setOption_aboutsite_wechat(String option_aboutsite_wechat) {
        this.option_aboutsite_wechat = option_aboutsite_wechat;
    }

    public String getOption_aboutsite_qq() {
        return option_aboutsite_qq;
    }

    public void setOption_aboutsite_qq(String option_aboutsite_qq) {
        this.option_aboutsite_qq = option_aboutsite_qq;
    }

    public String getOption_aboutsite_github() {
        return option_aboutsite_github;
    }

    public void setOption_aboutsite_github(String option_aboutsite_github) {
        this.option_aboutsite_github = option_aboutsite_github;
    }

    public String getOption_aboutsite_weibo() {
        return option_aboutsite_weibo;
    }

    public void setOption_aboutsite_weibo(String option_aboutsite_weibo) {
        this.option_aboutsite_weibo = option_aboutsite_weibo;
    }

    public String getOption_tongji() {
        return option_tongji;
    }

    public void setOption_tongji(String option_tongji) {
        this.option_tongji = option_tongji;
    }

    public Integer getOption_status() {
        return option_status;
    }

    public void setOption_status(Integer option_status) {
        this.option_status = option_status;
    }
}