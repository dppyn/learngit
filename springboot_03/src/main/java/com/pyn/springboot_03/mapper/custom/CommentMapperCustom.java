package com.pyn.springboot_03.mapper.custom;

import com.pyn.springboot_03.entity.Comment;
import com.pyn.springboot_03.entity.custom.CommentCustom;
import com.pyn.springboot_03.mapper.DemoSqlProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 言曌 on 2017/9/10.
 */
@Mapper
@Repository
public interface CommentMapperCustom {

	//根据文章id获取评论列表
	@SelectProvider(type = DemoSqlProvider.class, method = "listCommentByArticleId")
	public List<CommentCustom> listCommentByArticleId(Integer status, Integer id);
	
	//获得评论列表分页
	@SelectProvider(type = DemoSqlProvider.class, method = "listCommentByPage")
	public List<CommentCustom> listCommentByPage( Integer status, Integer startPos, Integer pageSize) throws Exception;

	//获得评论列表
	@SelectProvider(type = DemoSqlProvider.class, method = "listComment")
	public List<CommentCustom> listComment( Integer status) throws Exception;

	//统计评论数
	@SelectProvider(type = DemoSqlProvider.class, method = "countComment")
	public Integer countComment( Integer status) throws Exception;

	//获得最近评论
	@Select("SELECT * FROM comment where comment_status=1 AND comment_role=0  ORDER BY comment_id DESC  LIMIT #{limit}")
	public List<CommentCustom> listRecentComment( Integer limit) throws Exception;

	//获得评论的子评论
	@Select("SELECT * FROM comment where comment_pid=#{id}")
	public List<Comment> listChildComment( Integer id) throws Exception;

}
