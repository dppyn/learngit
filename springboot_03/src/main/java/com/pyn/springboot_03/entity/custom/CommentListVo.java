package com.pyn.springboot_03.entity.custom;


import com.pyn.springboot_03.util.others.Page;

/**
 *  用于封装评论信息，包括评论内容，作者信息，文章信息
  */
public class CommentListVo {
    //评论信息
    private CommentCustom commentCustom;

    //文章信息
    private ArticleCustom articleCustom;

    //分页信息
    private Page page;

    public CommentCustom getCommentCustom() {
        return commentCustom;
    }

    public void setCommentCustom(CommentCustom commentCustom) {
        this.commentCustom = commentCustom;
    }

    public ArticleCustom getArticleCustom() {
        return articleCustom;
    }

    public void setArticleCustom(ArticleCustom articleCustom) {
        this.articleCustom = articleCustom;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
