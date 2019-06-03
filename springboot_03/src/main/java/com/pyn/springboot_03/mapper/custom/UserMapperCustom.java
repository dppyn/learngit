package com.pyn.springboot_03.mapper.custom;

import com.pyn.springboot_03.entity.User;
import com.pyn.springboot_03.entity.custom.UserCustom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 言曌 on 2017/8/24.
 */
@Mapper
@Repository
public interface UserMapperCustom {
	
	//获得用户列表
	@Select("select * from user ORDER BY user_status ASC")
	public List<UserCustom> listUser() throws Exception;


	//根据用户名或Email获得用户
	@Select("select * from user where user_name=#{str} OR user_email=#{str} AND user_status>0 limit 1")
	public User getUserByNameOrEmail(String str) throws Exception;

	//根据用户名查用户
	@Select("select * from user where user_name=#{arg0} and user_pass=#{arg1} limit 1")
	public User getUserByName(String name,String word) throws Exception;

	//根据Email查询用户
	@Select("select * from user where user_email=#{email} limit 1")
	public User getUserByEmail(String email) throws Exception;

	//用户的文章数
	@Select("select count(*) from article where article_user_id=#{id}")
	public Integer countArticleByUser(Integer id) throws Exception;
}
