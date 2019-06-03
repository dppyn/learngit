package com.pyn.springboot_03.mapper;

import com.pyn.springboot_03.entity.Link;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LinkMapper {
    @Delete("delete from link where link_id = #{link_id}")
    int deleteByPrimaryKey(Integer link_id);

    @Insert("insert into link " +
            "values " +
            "(#{link_id}," +
            "#{link_url}," +
            "#{link_name}," +
            "#{link_image}," +
            "#{link_description}," +
            "#{link_owner_nickname}," +
            "#{link_owner_contact}," +
            "#{link_update_time}," +
            "#{link_create_time}," +
            "#{link_order}," +
            "#{link_status})")
    int insert(Link record);


    @Select("select * from link where link_id = #{link_id}")
    Link selectByPrimaryKey(Integer link_id);


    @Update(" update link" +
            "   set link_url = #{link_url,jdbcType=INTEGER}," +
            "   link_name = #{link_name,jdbcType=VARCHAR}," +
            "   link_image = #{link_image,jdbcType=INTEGER}," +
            "   link_description = #{link_description,jdbcType=INTEGER}," +
            "   link_owner_nickname = #{link_owner_nickname,jdbcType=VARCHAR}," +
            "   link_owner_contact = #{link_owner_contact,jdbcType=INTEGER}," +
            "   link_update_time = #{link_update_time,jdbcType=INTEGER}," +
            "   link_create_time = #{link_create_time,jdbcType=INTEGER}," +
            "   link_order = #{link_order,jdbcType=TIMESTAMP}," +
            "   link_status = #{link_status,jdbcType=TIMESTAMP}" +
            "   where link_id = #{link_id,jdbcType=INTEGER}")
    int updateByPrimaryKey(Link record);
}