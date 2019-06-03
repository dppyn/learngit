package com.pyn.springboot_03.mapper;


import com.pyn.springboot_03.entity.Article;
import com.pyn.springboot_03.entity.Category;
import com.pyn.springboot_03.entity.Tag;
import com.pyn.springboot_03.entity.User;
import com.pyn.springboot_03.entity.custom.*;
import com.pyn.springboot_03.mapper.custom.ArticleMapperCustom;
import com.pyn.springboot_03.mapper.custom.CategoryMapperCustom;
import com.pyn.springboot_03.mapper.custom.TagMapperCustom;
import com.pyn.springboot_03.util.others.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Mapper
@Repository
public class DemoSqlProvider {

    @Autowired
    private ArticleMapperCustom articleMapperCustom;
    @Autowired
    private CategoryMapperCustom categoryMapperCustom;
    @Autowired
    private TagMapper tagMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CategoryMapper categoryMapper;

    public List<ArticleListVo> ListArticleWithCategoryByPage(Integer status,Integer pageNow, Integer pageSize,Integer cateId) throws Exception {
        List<ArticleListVo> articleListVoList = new ArrayList<ArticleListVo>();
        List<ArticleCustom> articleCustomList = new ArrayList<ArticleCustom>();

        //获得分类的信息
        Category category = categoryMapper.selectByPrimaryKey(cateId);
        //如果没有这个分类，返回null
        System.out.println(category+"123");
        if(category==null) {
            return null;
        }
        Page page = null;
        int totalCount = articleMapperCustom.countArticleByCategory(status,cateId);

        if (pageNow != null) {
            page = new Page(totalCount, pageNow,pageSize);
            articleCustomList = categoryMapperCustom.listArticleWithCategoryByPage(status,cateId,page.getStartPos(), page.getPageSize());
        } else {
            page = new Page(totalCount, 1,pageSize);
            articleCustomList = categoryMapperCustom.listArticleWithCategoryByPage(status,cateId,page.getStartPos(), page.getPageSize());

        }

        for(int i=0;i<articleCustomList.size();i++) {
            ArticleListVo articleListVo = new ArticleListVo();

            //1、将文章信息装入 articleListVo
            ArticleCustom articleCustom = articleCustomList.get(i);
            articleListVo.setArticleCustom(articleCustom);


            //2、将分类信息装到 articleListVoList 中
            List<CategoryCustom> categoryCustomList = new ArrayList<CategoryCustom>();
            Integer parentCategoryId =articleCustomList.get(i).getArticle_parent_category_id();
            Integer childCategoryId =articleCustomList.get(i).getArticle_child_category_id();
            CategoryCustom categoryCustom = categoryMapperCustom.getCategoryById(status, parentCategoryId);
            CategoryCustom categoryCustom2 = categoryMapperCustom.getCategoryById(status,childCategoryId);
            if(categoryCustom!=null) {
                categoryCustomList.add(categoryCustom);
            }
            if(categoryCustom2!=null) {
                categoryCustomList.add(categoryCustom2);
            }
            articleListVo.setCategoryCustomList(categoryCustomList);

            articleListVoList.add(articleListVo);
        }
        //如果该分类还没有文章
        return articleListVoList;
    }


    public List<ArticleListVo> listArticleList(Integer status)  throws  Exception{
        List<ArticleListVo> articleListVoList = new ArrayList<ArticleListVo>();

        //获得文章列表信息和分页信息
        List<ArticleCustom> articleCustomList = articleMapperCustom.listArticle(status);

        //获得分类信息
        for (int i = 0; i < articleCustomList.size(); i++) {
            ArticleListVo articleListVo = new ArticleListVo();

            //1、将文章信息装到 articleListVoList 中
            ArticleCustom articleCustom = articleCustomList.get(i);
            articleListVo.setArticleCustom(articleCustom);

            //2、将分类信息装到 articleListVoList 中
            List<CategoryCustom> categoryCustomList = new ArrayList<CategoryCustom>();
            Integer parentCategoryId = articleCustomList.get(i).getArticle_parent_category_id();
            Integer childCategoryId = articleCustomList.get(i).getArticle_child_category_id();
            CategoryCustom categoryCustom = categoryMapperCustom.getCategoryById(1,parentCategoryId);
            CategoryCustom categoryCustom2 = categoryMapperCustom.getCategoryById(1,childCategoryId);
            if (categoryCustom != null) {
                categoryCustomList.add(categoryCustom);
            }
            if (categoryCustom2 != null) {
                categoryCustomList.add(categoryCustom2);
            }
            articleListVo.setCategoryCustomList(categoryCustomList);

            //3、获得标签信息
            List<TagCustom> tagCustomList = new ArrayList<TagCustom>();
            String tagIds = articleCustomList.get(i).getArticle_tag_ids();
            //防止该文章没有分类，空指针
            if (tagIds != null && tagIds != "") {
                String[] tagId = tagIds.split(",");
                for (int j = 0; j < tagId.length; j++) {
                    Tag tag = tagMapper.selectByPrimaryKey(Integer.valueOf(tagId[j]));
                    //防止标签不存在，被删除
                    if (tag != null) {
                        TagCustom tagCustom = new TagCustom();
                        BeanUtils.copyProperties(tag, tagCustom);
                        tagCustomList.add(tagCustom);
                    }
                }
            }
            articleListVo.setTagCustomList(tagCustomList);
            


            articleListVoList.add(articleListVo);

        }
        return articleListVoList;
    }

    public String selectcountArticle(Integer status){
        StringBuffer sql = new StringBuffer("SELECT COUNT(*) FROM article  ");
        if(status != null){
            sql.append(" where article_status=#{status}");
        }

        return sql.toString();
    }

    public String countArticleComment(Integer status){
        StringBuffer sql = new StringBuffer(" SELECT SUM(article_comment_count) FROM article ");
        if(status != null){
            sql.append(" where article_status=#{status} ");
        }

        return sql.toString();
    }

    public String countArticleView(Integer status){
        StringBuffer sql = new StringBuffer(" SELECT SUM(article_view_count) FROM article ");
        if(status != null){
            sql.append(" where article_status=#{status}");
        }

        return sql.toString();
    }

    public String listArticle(Integer status){
        //StringBuffer sql = new StringBuffer(" SELECT article_id,article_user_id, article_title, article_content, article_parent_category_id, article_child_category_id, articleTagIds, articleViewCount, articleCommentCount, articleLikeCount, articlePostTime, articleUpdateTime, articleIsComment, articleStatus, articleOrder from article");
        StringBuffer sql = new StringBuffer(" SELECT * from article ");
        if(status != null){
            sql.append(" where article_status=#{status}");
        }
        sql.append(" ORDER BY article_status ASC, article_order DESC, article_id DESC");
        return sql.toString();
    }


    public String getArticleById(Integer status,Integer id){
        StringBuffer sql = new StringBuffer(" SELECT * from article ");
        if(status != null){
            sql.append(" where article_status=#{arg0} and article_id=#{arg1}");
        }

        return sql.toString();
    }

    public String listArticleByPage(Integer status, Integer startPos, Integer pageSize){
        //StringBuffer sql = new StringBuffer(" SELECT articleId,articleUserId, articleTitle, articleContent, articleParentCategoryId, articleChildCategoryId, articleTagIds, articleViewCount, articleCommentCount, articleLikeCount, articlePostTime, articleUpdateTime, articleIsComment, articleStatus, articleOrder from article");
        StringBuffer sql = new StringBuffer(" SELECT * from article ");
        if(status != null){
            sql.append(" where article_status=#{arg0} ");
        }
        sql.append(" ORDER BY article_status ASC, article_order DESC, article_id DESC limit #{arg1},#{arg2}");
        return sql.toString();
    }

    public String getSearchResultCount(Integer status, String query){
        StringBuffer sql = new StringBuffer(" SELECT count(*) FROM article ");
        if(status != null){
            sql.append(" where article_status=#{arg0} AND ");
        }
        sql.append(" article_status > 0 AND article_title LIKE concat ('%',#{arg1},'%') OR article_content LIKE concat ('%',#{arg1},'%')");
        return sql.toString();
    }

    public String listSearchResultByPage(Integer status,  String query){
        StringBuffer sql = new StringBuffer(" select * FROM article ");
        if(status != null){
            sql.append(" where article_status=#{arg0} AND ");
        }
        sql.append(" article_status > 0 AND article_title LIKE concat ('%',#{arg1},'%') OR article_content LIKE concat ('%',#{arg1},'%') ");
        sql.append(" ORDER BY  article_status ASC, article_order DESC, article_id DESC");
        return sql.toString();
    }

    public String listArticleWithSameCategory(Integer status, Integer parentCategory,  Integer childCategory,  Integer limit){
        StringBuffer sql = new StringBuffer(" SELECT * FROM article ");
        if(status != null){
            sql.append(" where article_status=#{arg0} AND ");
        }
        if(parentCategory != null){
            sql.append(" article_parent_category_id=#{arg1} OR ");
        }
        if(childCategory != null){
            sql.append("  article_child_category_id=#{arg2} ");
        }
        sql.append("  ORDER BY  article_status ASC, article_order DESC, article_id DESC limit #{arg3} ");

        return sql.toString();
    }
    public String listArticleByViewCount(Integer status, Integer limit){
        StringBuffer sql = new StringBuffer(" select * FROM article ");
        if(status != null){
            sql.append(" where article_status=#{arg0} ");
        }
        sql.append(" ORDER BY  article_view_count DESC, article_order DESC, article_id DESC limit #{arg1}");
        return sql.toString();
    }

    public String getAfterArticle(Integer status, Integer id){
        StringBuffer sql = new StringBuffer(" select * FROM article where article_id > #{arg1}");
        if(status != null){
            sql.append(" AND article_status=#{arg0} ");
        }
        sql.append("ORDER BY  article_id  limit 1");
        return sql.toString();
    }
    public String getPreArticle(Integer status, Integer id){
        StringBuffer sql = new StringBuffer(" select * FROM article where article_id < #{arg1}");
        if(status != null){
            sql.append(" AND article_status=#{arg0} ");
        }
        sql.append("ORDER BY  article_id  limit 1");
        return sql.toString();
    }
    public String listRandomArticle(Integer status, Integer limit){
        StringBuffer sql = new StringBuffer(" select * FROM article ");
        if(status != null){
            sql.append(" where article_status=#{arg0} ");
        }
        sql.append(" ORDER BY RAND() limit #{arg1}");
        return sql.toString();
    }
    public String listArticleByCommentCount(Integer status, Integer limit){
        StringBuffer sql = new StringBuffer(" select * FROM article ");
        if(status != null){
            sql.append(" where article_status=#{arg0} ");
        }
        sql.append(" ORDER BY  article_comment_count DESC, article_order DESC, article_id DESC limit #{arg1}");
        return sql.toString();
    }
    public String countArticleByCategory(Integer status, Integer id){
        StringBuffer sql = new StringBuffer(" select count(*) FROM article ");
        if(status != null){
            sql.append(" where article_status=#{arg0} AND");
        }
        sql.append(" article_parent_category_id=#{arg1} OR article_child_category_id=#{arg1}");
        return sql.toString();
    }
    public String  countArticleByTag(Integer status, Integer id){
        StringBuffer sql = new StringBuffer(" select count(*) FROM article ");
        sql.append("where article.article_tag_ids = #{arg1} OR article.article_tag_ids LIKE concat ('%',#{arg1},'%') OR article.article_tag_ids LIKE concat ('%',#{arg1},'%') OR article.article_tag_ids LIKE concat ('%',#{arg1},'%') ");
        if(status != null){
            sql.append("AND article_status=#{arg0} ");
        }
        return sql.toString();
    }

    public String  countCategory(Integer status){
        StringBuffer sql = new StringBuffer("  SELECT COUNT(*) FROM category ");
        if(status != null){
            sql.append(" where category_status=#{status} ");
        }
        return sql.toString();
    }

    public String   listCategory(Integer status){
        StringBuffer sql = new StringBuffer("  SELECT * FROM category ");
        if(status != null){
            sql.append(" where category_status=#{status}  order by category_status ASC, category_order desc,category_id asc");
        }
        return sql.toString();
    }
    public String   getCategoryById(Integer status, Integer id){
        StringBuffer sql = new StringBuffer("  SELECT * FROM category where ");
        if(status != null){
            sql.append(" category_status=#{arg0} AND  ");
        }
        sql.append(" category.category_id=#{arg1}");
        return sql.toString();
    }
    public String  listArticleWithCategoryByPage(Integer status, Integer cateId,  Integer startPos,  Integer pageSize){
        StringBuffer sql = new StringBuffer("  SELECT * FROM article where article_status=#{arg0} AND  ");

        sql.append("  article_parent_category_id=#{arg1} OR article_child_category_id=#{arg1}  ");
        sql.append("  ORDER BY article_id DESC   limit #{arg2},#{arg3}  ");
        return sql.toString();
    }
    public String findChildCategory(Integer status,Integer id){
        StringBuffer sql = new StringBuffer("  SELECT * FROM category where" );
        if(status != null){
            sql.append(" category_status=#{arg0} AND ");
        }
        sql.append(" category_pid=#{id} ");
        return sql.toString();
    }
    public String listCommentByArticleId(Integer status,Integer id){
        StringBuffer sql = new StringBuffer("  SELECT * FROM comment where ");
        sql.append(" comment_article_id=#{arg1} ");
        if(status != null){
            sql.append("  AND comment_status=#{arg0}  ");
        }
        sql.append("  ORDER BY comment_id ASC ");
        return sql.toString();
    }

    public String listCommentByPage(Integer status, Integer startPos, Integer pageSize){
        StringBuffer sql = new StringBuffer("  SELECT * FROM comment ");
        if(status != null){
            sql.append("  where comment_status=#{arg0} ");
        }
        sql.append(" ORDER BY comment_status ASC, comment_id DESC limit #{arg1},#{arg2} ");
        return sql.toString();
    }
    public String listComment( Integer status ){
        StringBuffer sql = new StringBuffer("  SELECT * FROM comment ");
        if(status != null){
            sql.append("  where comment_status=#{status} ");
        }
        sql.append("  ORDER BY comment_id asc ");
        return sql.toString();
    }
    public String  countComment( Integer status){
        StringBuffer sql = new StringBuffer("  SELECT count(*) FROM comment ");
        if(status != null){
            sql.append("  where comment_status=#{arg0} ");
        }

        return sql.toString();
    }
    public String  countLink( Integer status){
        StringBuffer sql = new StringBuffer("  SELECT COUNT(*) FROM link ");
        if(status != null){
            sql.append("  where link_status=#{status} ");
        }

        return sql.toString();
    }
    public String  listLink( Integer status){
        StringBuffer sql = new StringBuffer("  SELECT  * FROM link ");
        if(status != null){
            sql.append("  where link_status=#{status} ");
        }
        sql.append(" ORDER BY link_status ASC,link_order DESC,link_id ASC");
        return sql.toString();
    }
    public String  listMenu( Integer status){
        StringBuffer sql = new StringBuffer("  SELECT  * FROM menu ");
        if(status != null){
            sql.append("  where menu_status=#{status} ");
        }
        sql.append(" ORDER BY menu_status ASC, menu_order DESC,menu_id ASC ");
        return sql.toString();
    }
    public String  countNotice( Integer status){
        StringBuffer sql = new StringBuffer("  SELECT COUNT(*) FROM notice");
        if(status != null){
            sql.append("  where notice_status=#{status} ");
        }
        return sql.toString();
    }
    public String  listNotice( Integer status){
        StringBuffer sql = new StringBuffer("  SELECT * FROM notice");
        if(status != null){
            sql.append("  where notice_status=#{status} ");
        }
        sql.append("ORDER BY notice_status ASC, notice_order DESC, notice_id ASC");
        return sql.toString();
    }
    public String  listPage( Integer status){
        StringBuffer sql = new StringBuffer("  SELECT * FROM page");
        if(status != null){
            sql.append("  where page_status=#{status} ");
        }
        return sql.toString();
    }
    public String  getPageByKey( Integer status, String key){
        StringBuffer sql = new StringBuffer("  SELECT * FROM page where ");
        if(status != null){
            sql.append(" page_status=#{arg0}  AND ");
        }
        sql.append(" page_key=#{arg1} ");
        return sql.toString();
    }
    public String  listTag( Integer status){
        StringBuffer sql = new StringBuffer("  SELECT * FROM tag  ");
        if(status != null){
            sql.append(" where tag_status=#{status} ");
        }
        sql.append("  ORDER BY tag_status ASC ");
        return sql.toString();
    }
    public String  countTag( Integer status){
        StringBuffer sql = new StringBuffer("  SELECT COUNT(*) FROM tag  ");
        if(status != null){
            sql.append(" where tag_status=#{status} ");
        }

        return sql.toString();
    }
    public String  listArticleWithTagByPage( Integer status, Integer tagId, Integer startPos,  Integer pageSize){
        StringBuffer sql = new StringBuffer("  SELECT * from article  where");
        if(status != null){
            sql.append("  articleStatus=#{arg0} AND ");
        }
        sql.append(" article.articleTagIds = #{arg1} OR");
        sql.append(" article.articleTagIds LIKE concat (#{arg1},'%') OR");
        sql.append(" article.articleTagIds LIKE concat ('%',#{arg1},'%') OR");
        sql.append(" article.articleTagIds LIKE concat ('%',#{arg1}) ");
        sql.append(" limit #{arg2},#{arg3} ");
        return sql.toString();
    }

}

