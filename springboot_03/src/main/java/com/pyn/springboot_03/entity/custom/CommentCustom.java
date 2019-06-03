package com.pyn.springboot_03.entity.custom;

import com.pyn.springboot_03.entity.Comment;

/**
 * 评论者头像
 */
public class CommentCustom extends Comment {
    //评论者的头像
    private String commentAuthorAvatar;

    public String getCommentAuthorAvatar() {
        return commentAuthorAvatar;
    }

    public void setCommentAuthorAvatar(String commentAuthorAvatar) {
        this.commentAuthorAvatar = commentAuthorAvatar;
    }
}
