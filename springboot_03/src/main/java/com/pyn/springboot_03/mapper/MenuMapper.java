package com.pyn.springboot_03.mapper;

import com.pyn.springboot_03.entity.Menu;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MenuMapper {
    @Delete("delete from menu where menu_id = #{menu_id}")
    int deleteByPrimaryKey(Integer menu_id);


    @Insert("insert into menu " +
            "values " +
            "(#{menu_id}," +
            "#{menu_name}," +
            "#{menu_url}," +
            "#{menu_level}," +
            "#{menu_icon}," +
            "#{menu_order}," +
            "#{menu_status})")
    int insert(Menu record);


    @Select("select * from menu where menu_id = #{menu_id}")
    Menu selectByPrimaryKey(Integer menu_id);

    @Update(" update menu" +
            "   set menu_name = #{menu_name,jdbcType=INTEGER}," +
            "   menu_url = #{menu_url,jdbcType=VARCHAR}," +
            "   menu_level = #{menu_level,jdbcType=INTEGER}," +
            "   menu_icon = #{menu_icon,jdbcType=INTEGER}," +
            "   menu_order = #{menu_order,jdbcType=VARCHAR}," +
            "   menu_status = #{menu_status,jdbcType=INTEGER}" +
            "   where menu_id = #{menu_id,jdbcType=INTEGER}")
    int updateByPrimaryKey(Menu record);
}