package com.pyn.springboot_03.mapper.custom;



import com.pyn.springboot_03.entity.Category;
import com.pyn.springboot_03.entity.custom.ArticleCustom;
import com.pyn.springboot_03.entity.custom.CategoryCustom;
import com.pyn.springboot_03.mapper.DemoSqlProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by 言曌 on 2017/8/24.
 */
@Mapper
@Repository
public interface CategoryMapperCustom {
	//查询分类总数
	@SelectProvider(type = DemoSqlProvider.class, method = "countCategory")
	public Integer countCategory( Integer status) throws Exception;
	
	//获得分类列表
	@SelectProvider(type = DemoSqlProvider.class, method = "listCategory")
	public List<CategoryCustom> listCategory(Integer status) throws Exception;
	
	//根据分类id获得分类信息
	@SelectProvider(type = DemoSqlProvider.class, method = "getCategoryById")
	public CategoryCustom getCategoryById( Integer status, Integer id) throws Exception;

	//获得含有该分类的文章列表
	@SelectProvider(type = DemoSqlProvider.class, method = "listArticleWithCategoryByPage")
	public List<ArticleCustom> listArticleWithCategoryByPage(Integer status, Integer cateId,  Integer startPos,  Integer pageSize) throws Exception;

	//删除分类
	@Delete(" DELETE FROM category WHERE category_id=#{value}")
	public void deleteCategory(Integer id) throws Exception;

	//根据父分类找子分类
	@SelectProvider(type = DemoSqlProvider.class, method = "findChildCategory")
	public List<CategoryCustom> findChildCategory( Integer status,Integer id) throws Exception;

	//根据标签名获取标签
	@Select("SELECT * FROM category where category_name=#{name} limit 1")
	public Category  getCategoryByName(String name) throws Exception;

}



