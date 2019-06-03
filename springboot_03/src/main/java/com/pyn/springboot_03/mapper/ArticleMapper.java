package com.pyn.springboot_03.mapper;

import com.pyn.springboot_03.entity.Article;
import org.apache.ibatis.annotations.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
@Component
@ConfigurationProperties(prefix = "mysql.datasource.slave")
public interface ArticleMapper {

    @Delete("delete from article where article_id = #{article_id}")
    int deleteByPrimaryKey(Integer article_id);

    @Insert("insert into article " +
            "values " +
            "(#{article_id}," +
            "#{article_user_id}," +
            "#{article_title}," +
            "#{article_content}," +
            "#{article_parent_category_id}," +
            "#{article_child_category_id}," +
            "#{article_tag_ids}," +
            "#{article_view_count}," +
            "#{article_comment_count}," +
            "#{article_like_count}," +
            "#{article_post_time}," +
            "#{article_update_time}," +
            "#{article_is_comment}," +
            "#{article_status}," +
            "#{article_order})")
    int insert(Article record);

    @Select("select * from article where article_id = #{article_id}")
    Article selectByPrimaryKey(Integer article_id);

    @Update(" update article" +
            "   set article_user_id = #{article_user_id,jdbcType=INTEGER}," +
            "   article_title = #{article_title,jdbcType=VARCHAR}," +
            "   article_content = #{article_content,jdbcType=INTEGER}," +
            "   article_parent_category_id = #{article_parent_category_id,jdbcType=INTEGER}," +
            "   article_child_category_id = #{article_child_category_id,jdbcType=INTEGER}," +
            "   article_tag_ids = #{article_tag_ids,jdbcType=VARCHAR}," +
            "   article_view_count = #{article_view_count,jdbcType=INTEGER}," +
            "   article_comment_count = #{article_comment_count,jdbcType=INTEGER}," +
            "   article_like_count = #{article_like_count,jdbcType=INTEGER}," +
            "   article_post_time = #{article_post_time,jdbcType=TIMESTAMP}," +
            "   article_update_time = #{article_update_time,jdbcType=TIMESTAMP}," +
            "   article_is_comment = #{article_is_comment,jdbcType=INTEGER}," +
            "   article_status = #{article_status,jdbcType=INTEGER}," +
            "   article_order = #{article_order,jdbcType=INTEGER}" +
            "   where article_id = #{article_id,jdbcType=INTEGER}")
    int update(Article article);
}