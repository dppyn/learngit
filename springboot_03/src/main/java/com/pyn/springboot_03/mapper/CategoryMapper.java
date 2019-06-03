package com.pyn.springboot_03.mapper;

import com.pyn.springboot_03.entity.Category;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CategoryMapper {

    @Delete("delete from  category where category_id = #{category_id}")
    int deleteByPrimaryKey(Integer category_id);

    @Insert("insert into category " +
            "values " +
            "(#{category_id}," +
            "#{category_pid}," +
            "#{category_name}," +
            "#{category_description}," +
            "#{category_order}," +
            "#{category_icon}," +
            "#{category_status})" )
    int insert(Category record);

    @Select("select * from category where category_id = #{category_id}")
    Category selectByPrimaryKey(Integer category_id);

    @Update(" update category" +
            "   set category_id = #{category_id,jdbcType=INTEGER}," +
            "   category_pid = #{category_pid,jdbcType=VARCHAR}," +
            "   category_name = #{category_name,jdbcType=INTEGER}," +
            "   category_description = #{category_description,jdbcType=INTEGER}," +
            "   category_order = #{category_order,jdbcType=VARCHAR}," +
            "   category_icon = #{category_icon,jdbcType=INTEGER}," +
            "   category_status = #{category_status,jdbcType=INTEGER} " +
            "   where category_id = #{category_id,jdbcType=INTEGER}")
    int update(Category record);
}