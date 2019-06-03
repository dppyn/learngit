package com.pyn.springboot_03.mapper;

import com.pyn.springboot_03.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    @Delete("delete from user where user_id = #{user_id}")
    int deleteByPrimaryKey(Integer user_id);

    @Insert("insert into user " +
            "values " +
            "(#{user_id}," +
            "#{user_name}," +
            "#{user_pass}," +
            "#{user_nickname}," +
            "#{user_email}," +
            "#{user_url}," +
            "#{user_avatar}," +
            "#{user_last_login_ip}," +
            "#{user_register_time}," +
            "#{user_last_login_time}," +
            "#{user_status})")
    int insert(User record);


    @Select("select * from user where user_id = #{user_id}")
    User selectByPrimaryKey(Integer user_id);


    @Update(" update user" +
            "   set user_name = #{user_name}," +
            "    user_pass= #{user_pass}," +
            "    user_nickname= #{user_nickname}," +
            "    user_email= #{user_email}," +
            "    user_url= #{user_url}," +
            "    user_avatar= #{user_avatar}," +
            "    user_last_login_ip= #{user_last_login_ip}," +
            "    user_register_time= #{user_register_time}," +
            "    user_last_login_time = #{user_last_login_time}," +
            "    user_status= #{user_status}" +
            "   where user_id = #{user_id}")
    int updateByPrimaryKey(User record);
}