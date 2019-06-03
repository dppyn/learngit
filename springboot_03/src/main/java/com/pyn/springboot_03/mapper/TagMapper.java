package com.pyn.springboot_03.mapper;

import com.pyn.springboot_03.entity.Tag;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TagMapper {
    @Delete("delete from tag where tag_id = #{tag_id}")
    int deleteByPrimaryKey(Integer tag_id);

    @Insert("insert into tag " +
            "values " +
            "(#{tag_id}," +
            "#{tag_name}," +
            "#{tag_description}," +
            "#{tag_status})")
    int insert(Tag record);


    @Select("select * from tag where tag_id = #{tag_id}")
    Tag selectByPrimaryKey(Integer tag_id);


    @Update(" update tag" +
            "   set tag_name = #{tag_name,jdbcType=INTEGER}," +
            "   tag_description = #{tag_description,jdbcType=VARCHAR}," +
            "   tag_status = #{tag_status,jdbcType=INTEGER}" +
            "   where tag_id= #{tag_id,jdbcType=INTEGER}")
    int updateByPrimaryKey(Tag record);
}