package com.pyn.springboot_03.mapper;

import com.pyn.springboot_03.entity.Options;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OptionsMapper {
    @Delete("delete from options where option_id = #{option_id}")
    int deleteByPrimaryKey(Integer option_id);

    @Insert("insert into options " +
            "values " +
            "(#{option_id}," +
            "#{option_site_title}," +
            "#{option_site_descrption}," +
            "#{option_meta_descrption}," +
            "#{option_meta_keyword}," +
            "#{option_aboutsite_avatar}," +
            "#{option_aboutsite_title}," +
            "#{option_aboutsite_content}," +
            "#{option_aboutsite_wechat}," +
            "#{option_aboutsite_qq}," +
            "#{option_aboutsite_github}," +
            "#{option_aboutsite_weibo}," +
            "#{option_tongji}," +
            "#{option_status})")
    int insert(Options record);


    @Select("select * from options where option_id = #{option_id}")
    Options selectByPrimaryKey(Integer option_id);


    @Update(" update options" +
            "   set  option_site_title= #{option_site_title,jdbcType=INTEGER}," +
            "   option_site_descrption = #{option_site_descrption,jdbcType=VARCHAR}," +
            "   option_meta_descrption = #{option_meta_descrption,jdbcType=INTEGER}," +
            "   option_meta_keyword = #{option_meta_keyword,jdbcType=INTEGER}," +
            "   option_aboutsite_avatar = #{option_aboutsite_avatar,jdbcType=VARCHAR}," +
            "   option_aboutsite_title= #{option_aboutsite_title,jdbcType=INTEGER}," +
            "   option_aboutsite_content = #{option_aboutsite_content,jdbcType=INTEGER}," +
            "   option_aboutsite_wechat = #{option_aboutsite_wechat,jdbcType=INTEGER}," +
            "   option_aboutsite_qq = #{option_aboutsite_qq,jdbcType=TIMESTAMP}," +
            "   option_aboutsite_github = #{option_aboutsite_github,jdbcType=TIMESTAMP}," +
            "   option_aboutsite_weibo = #{option_aboutsite_weibo,jdbcType=INTEGER}," +
            "   option_tongji = #{option_tongji,jdbcType=INTEGER}," +
            "   option_status = #{option_status,jdbcType=INTEGER}" +
            "   where option_id = #{option_id,jdbcType=INTEGER}")
    int updateByPrimaryKey(Options record);
}