package com.pyn.springboot_03.mapper;

import com.pyn.springboot_03.entity.Page;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PageMapper {
    @Delete("delete from page where page_id = #{page_id}")
    int deleteByPrimaryKey(Integer page_id);

    @Insert("insert into page " +
            "values " +
            "(#{page_id}," +
            "#{page_key}," +
            "#{page_title}," +
            "#{page_content}," +
            "#{page_create_time}," +
            "#{page_update_time}," +
            "#{page_view_count}," +
            "#{page_comment_count}," +
            "#{page_status})")
    int insert(Page record);


    @Select("select * from page where page_id = #{page_id}")
    Page selectByPrimaryKey(Integer page_id);


    @Update(" update page" +
            "   set page_key = #{page_key,jdbcType=INTEGER}," +
            "   page_title = #{page_title,jdbcType=VARCHAR}," +
            "   page_content = #{page_content,jdbcType=INTEGER}," +
            "   page_create_time = #{page_create_time,jdbcType=INTEGER}," +
            "   page_update_time = #{page_update_time,jdbcType=VARCHAR}," +
            "   page_view_count = #{page_view_count,jdbcType=INTEGER}," +
            "   page_comment_count = #{page_comment_count,jdbcType=INTEGER}," +
            "   page_status = #{page_status,jdbcType=INTEGER}" +
            "   where page_id = #{page_id,jdbcType=INTEGER}")
    int updateByPrimaryKey(Page record);
}