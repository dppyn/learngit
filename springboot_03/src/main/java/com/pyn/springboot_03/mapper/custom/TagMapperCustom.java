package com.pyn.springboot_03.mapper.custom;


import com.pyn.springboot_03.entity.Tag;
import com.pyn.springboot_03.entity.custom.ArticleCustom;
import com.pyn.springboot_03.entity.custom.TagCustom;
import com.pyn.springboot_03.mapper.DemoSqlProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 言曌 on 2017/9/2.
 */
@Mapper
@Repository
public interface TagMapperCustom {
	//获得标签总数
	@SelectProvider(type = DemoSqlProvider.class, method = "countTag")
	public Integer countTag(Integer status) throws Exception;
	
	//获得标签列表
	@SelectProvider(type = DemoSqlProvider.class, method = "listTag")
	public List<TagCustom> listTag(Integer status) throws Exception;

	//获得带有该标签的文章列表
	@SelectProvider(type = DemoSqlProvider.class, method = "listArticleWithTagByPage")
	public List<ArticleCustom> listArticleWithTagByPage( Integer status, Integer tagId, Integer startPos,  Integer pageSize) throws Exception;

	//根据标签名获取标签
	@Select("select * from tag where tag_name=#{name} limit 1 ")
	public Tag  getTagByName(String name) throws Exception;

}
