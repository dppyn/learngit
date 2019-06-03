package com.pyn.springboot_03.entity;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private Integer article_id;  //文章id

    private Integer article_user_id;  //文章作者id

    private String article_title;  //文章标题

    private Integer article_parent_category_id; //文章父类别id

    private Integer article_child_category_id;   //文章子类别id

    private String article_tag_ids;      //文章标签id

    private Integer article_view_count;  //文章观点数

    private Integer article_comment_count;  //文章评论数

    private Integer article_like_count;     //文章链接数

    private Date article_post_time;    //文章发布时间

    private Date article_update_time;  //文章更新时间

    private Integer article_is_comment; //文章评论

    private Integer article_status;   //文章状态

    private Integer article_order;   //文章顺序

    private String article_content;  //文章内容

    @Override
    public String toString() {
        return "Article{" +
                "article_id=" + article_id +
                ", article_user_id=" + article_user_id +
                ", article_title='" + article_title + '\'' +
                ", article_parent_category_id=" + article_parent_category_id +
                ", article_child_category_id=" + article_child_category_id +
                ", article_tag_ids='" + article_tag_ids + '\'' +
                ", article_view_count=" + article_view_count +
                ", article_comment_count=" + article_comment_count +
                ", article_like_count=" + article_like_count +
                ", article_post_time=" + article_post_time +
                ", article_update_time=" + article_update_time +
                ", article_is_comment=" + article_is_comment +
                ", article_status=" + article_status +
                ", article_order=" + article_order +
                ", article_content='" + article_content + '\'' +
                '}';
    }

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public Integer getArticle_user_id() {
        return article_user_id;
    }

    public void setArticle_user_id(Integer article_user_id) {
        this.article_user_id = article_user_id;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public Integer getArticle_parent_category_id() {
        return article_parent_category_id;
    }

    public void setArticle_parent_category_id(Integer article_parent_category_id) {
        this.article_parent_category_id = article_parent_category_id;
    }

    public Integer getArticle_child_category_id() {
        return article_child_category_id;
    }

    public void setArticle_child_category_id(Integer article_child_category_id) {
        this.article_child_category_id = article_child_category_id;
    }

    public String getArticle_tag_ids() {
        return article_tag_ids;
    }

    public void setArticle_tag_ids(String article_tag_ids) {
        this.article_tag_ids = article_tag_ids;
    }

    public Integer getArticle_view_count() {
        return article_view_count;
    }

    public void setArticle_view_count(Integer article_view_count) {
        this.article_view_count = article_view_count;
    }

    public Integer getArticle_comment_count() {
        return article_comment_count;
    }

    public void setArticle_comment_count(Integer article_comment_count) {
        this.article_comment_count = article_comment_count;
    }

    public Integer getArticle_like_count() {
        return article_like_count;
    }

    public void setArticle_like_count(Integer article_like_count) {
        this.article_like_count = article_like_count;
    }

    public Date getArticle_post_time() {
        return article_post_time;
    }

    public void setArticle_post_time(Date article_post_time) {
        this.article_post_time = article_post_time;
    }

    public Date getArticle_update_time() {
        return article_update_time;
    }

    public void setArticle_update_time(Date article_update_time) {
        this.article_update_time = article_update_time;
    }

    public Integer getArticle_is_comment() {
        return article_is_comment;
    }

    public void setArticle_is_comment(Integer article_is_comment) {
        this.article_is_comment = article_is_comment;
    }

    public Integer getArticle_status() {
        return article_status;
    }

    public void setArticle_status(Integer article_status) {
        this.article_status = article_status;
    }

    public Integer getArticle_order() {
        return article_order;
    }

    public void setArticle_order(Integer article_order) {
        this.article_order = article_order;
    }

    public String getArticle_content() {
        return article_content;
    }

    public void setArticle_content(String article_content) {
        this.article_content = article_content;
    }
}