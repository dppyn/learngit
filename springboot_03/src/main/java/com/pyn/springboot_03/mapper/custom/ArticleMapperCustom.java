package com.pyn.springboot_03.mapper.custom;



import com.pyn.springboot_03.entity.Article;
import com.pyn.springboot_03.entity.custom.ArticleCustom;
import com.pyn.springboot_03.mapper.DemoSqlProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 言曌 on 2017/8/24.
 */
@Mapper
@Repository
public interface ArticleMapperCustom {
	//获取文章总数

	@SelectProvider(type = DemoSqlProvider.class, method = "selectcountArticle")
	public Integer countArticle( Integer status) throws Exception;
	
	//获得留言总数
	@SelectProvider(type = DemoSqlProvider.class, method = "countArticleComment")
	public Integer countArticleComment(Integer status) throws Exception;
	
	//获得浏览量总数
	@SelectProvider(type = DemoSqlProvider.class, method = "countArticleView")
	public Integer countArticleView( Integer status) throws Exception;
	
	//获得所有文章(文章归档)
	@SelectProvider(type = DemoSqlProvider.class, method = "listArticle")
	public List<ArticleCustom> listArticle(Integer status) throws Exception;
	
	//根据id查询用户信息
	@SelectProvider(type = DemoSqlProvider.class, method = "getArticleById")
	public Article getArticleById(Integer status, Integer id) throws Exception;

	@Select("SELECT article_content from article where article_id=#{id}")
	public ArticleCustom a( Integer id) ;

	//分页操作
    @SelectProvider(type = DemoSqlProvider.class, method = "listArticleByPage")
	public List<ArticleCustom> listArticleByPage( Integer status,  Integer startPos, Integer pageSize) throws Exception;
	
	//文章结果查询结果的数量
    @SelectProvider(type = DemoSqlProvider.class, method = "getSearchResultCount")
	public Integer getSearchResultCount( Integer status,  String query) throws Exception;
	
	//查询文章分页操作
    @SelectProvider(type = DemoSqlProvider.class, method = "listSearchResultByPage")
	public List<ArticleCustom> listSearchResultByPage(Integer status,  String query) throws Exception;
	
	//获得同分类的文章(相关文章)
    @SelectProvider(type = DemoSqlProvider.class, method = "listArticleWithSameCategory")
	public List<ArticleCustom> listArticleWithSameCategory(Integer status, Integer parentCategory,  Integer childCategory,  Integer limit) throws Exception;
	
	//获得访问最多的文章(猜你喜欢)
    @SelectProvider(type = DemoSqlProvider.class, method = "listArticleByViewCount")
	public List<ArticleCustom> listArticleByViewCount(Integer status, Integer limit) throws Exception;
	
	//获得上一篇文章
    @SelectProvider(type = DemoSqlProvider.class, method = "getAfterArticle")
	public ArticleCustom getAfterArticle( Integer status, Integer id) throws Exception;
	
	//获得下一篇文章
    @SelectProvider(type = DemoSqlProvider.class, method = "getPreArticle")
	public ArticleCustom getPreArticle( Integer status,  Integer id) throws Exception;
	
	//获得随机文章
    @SelectProvider(type = DemoSqlProvider.class, method = "listRandomArticle")
	public List<ArticleCustom> listRandomArticle( Integer status, Integer limit) throws  Exception;

	//热评文章
    @SelectProvider(type = DemoSqlProvider.class, method = "listArticleByCommentCount")
	public List<ArticleCustom> listArticleByCommentCount( Integer status,  Integer limit) throws Exception;

	//获得该分类的文章数
    @SelectProvider(type = DemoSqlProvider.class, method = "countArticleByCategory")
	public Integer countArticleByCategory( Integer status,Integer id) throws Exception;

	//获得该分类的文章数
    @SelectProvider(type = DemoSqlProvider.class, method = "countArticleByTag")
	public Integer countArticleByTag(Integer status,  Integer id) throws Exception;

	//更新文章的评论数
    @Update("UPDATE article SET article_comment_count= (SELECT count(*) FROM comment   WHERE article.article_id=comment.comment_article_id AND comment_status=1 ) WHERE article_id=#{article_id}")
	public void updateCommentCount( Integer articleId) throws Exception;

	//获得最后更新的记录
    @Select("select * FROM article where article_update_time= (SELECT max(article_update_time) FROM article)")
	public ArticleCustom getLastUpdateArticle() throws Exception;


}



