package com.pyn.springboot_03.mapper;

import com.pyn.springboot_03.entity.Notice;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface NoticeMapper {
    @Delete("delete from notice where notice_id = #{notice_id}")
    int deleteByPrimaryKey(Integer notice_id);

    @Insert("insert into notice " +
            "values " +
            "(#{notice_id}," +
            "#{notice_title}," +
            "#{notice_content}," +
            "#{notice_create_time}," +
            "#{notice_update_time}," +
            "#{notice_status}," +
            "#{notice_order})")
    int insert(Notice record);


    @Select("select * from notice where notice_id = #{notice_id}")
    Notice selectByPrimaryKey(Integer notice_id);

    @Update(" update notice" +
            "   set notice_title = #{notice_title,jdbcType=INTEGER}," +
            "   notice_content = #{notice_content,jdbcType=VARCHAR}," +
            "   notice_create_time = #{notice_create_time,jdbcType=INTEGER}," +
            "   notice_update_time= #{notice_update_time,jdbcType=INTEGER}," +
            "   notice_status= #{notice_status,jdbcType=VARCHAR}," +
            "   notice_order = #{notice_order,jdbcType=INTEGER}" +
            "   where notice_id = #{notice_id,jdbcType=INTEGER}")
    int updateByPrimaryKey(Notice record);
}