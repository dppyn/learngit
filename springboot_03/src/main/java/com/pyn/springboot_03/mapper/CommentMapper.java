package com.pyn.springboot_03.mapper;

import com.pyn.springboot_03.entity.Comment;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CommentMapper {
    @Delete("delete from comment where comment_id = #{comment_id}")
    int deleteByPrimaryKey(Integer comment_id);

    @Insert("insert into comment " +
            "values  " +
            "(#{comment_id}," +
            "#{comment_pid}," +
            "#{comment_pname}," +
            "#{comment_article_id}," +
            "#{comment_author_name}," +
            "#{comment_author_email}," +
            "#{comment_author_url}," +
            "#{comment_content}," +
            "#{comment_agent}," +
            "#{comment_ip}," +
            "#{comment_create_time}," +
            "#{comment_role}," +
            "#{comment_status})")
    int insert(Comment record);

    @Select("select * from comment where comment_id = #{comment_id}")
    Comment selectByPrimaryKey(Integer comment_id);

    @Update(" update comment" +
            "   set " +
            "   comment_pid = #{comment_pid,jdbcType=INTEGER}," +
            "   comment_pname = #{comment_pname,jdbcType=VARCHAR}," +
            "   comment_article_id = #{comment_article_id,jdbcType=INTEGER}," +
            "   comment_authorName = #{comment_authorName,jdbcType=INTEGER}," +
            "   comment_authorEmail = #{comment_authorEmail,jdbcType=VARCHAR}," +
            "   comment_authorUrl = #{comment_authorUrl,jdbcType=INTEGER}," +
            "   comment_content = #{comment_content,jdbcType=INTEGER}," +
            "   comment_agent = #{comment_agent,jdbcType=INTEGER}," +
            "   comment_ip = #{comment_ip,jdbcType=TIMESTAMP}," +
            "   comment_createTime = #{comment_createTime,jdbcType=TIMESTAMP}," +
            "   comment_role = #{comment_role,jdbcType=INTEGER}," +
            "   comment_status = #{comment_status,jdbcType=INTEGER} " +
            "   where comment_id = #{comment_id,jdbcType=INTEGER}")
    int updateByPrimaryKey(Comment record);
}