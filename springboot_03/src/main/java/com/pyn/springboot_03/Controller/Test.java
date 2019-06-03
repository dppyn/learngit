package com.pyn.springboot_03.Controller;




import com.pyn.springboot_03.entity.Article;
import com.pyn.springboot_03.entity.Category;
import com.pyn.springboot_03.entity.Comment;
import com.pyn.springboot_03.entity.User;
import com.pyn.springboot_03.entity.custom.ArticleCustom;
import com.pyn.springboot_03.entity.custom.ArticleListVo;
import com.pyn.springboot_03.entity.custom.CategoryCustom;
import com.pyn.springboot_03.entity.custom.UserCustom;
import com.pyn.springboot_03.mapper.*;
import com.pyn.springboot_03.mapper.custom.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Controller
public class Test {

    @Autowired
    private ArticleMapperCustom articleMapperCustom;
    @Autowired
    private CategoryMapperCustom categoryMapperCustom;
    @Autowired
    private CommentMapperCustom commentMapperCustom;
    @Autowired
    private LinkMapperCustom linkMapperCustom;
    @Autowired
    private MenuMapperCustom menuMapperCustom;
    @Autowired
    private NoticeMapperCustom noticeMapperCustom;
    @Autowired
    private OptionsMapperCustom optionsMapperCustom;
    @Autowired
    private PageMapperCustom pageMapperCustom;
    @Autowired
    private TagMapperCustom tagMapperCustom;
    @Autowired
    private UserMapperCustom userMapperCustom;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private LinkMapper linkMapper;
    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private NoticeMapper noticeMapper;
    @Autowired
    private OptionsMapper optionsMapper;
    @Autowired
    private PageMapper pageMapper;
    @Autowired
    private TagMapper tagMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DemoSqlProvider demoSqlProvider;
    @RequestMapping("/test")
    public  String ppp() throws Exception{
        /*int a = articleMapperCustom.countArticle(1);
        System.out.println(a);*/
        /*int b = articleMapperCustom.countArticleComment(1);
        System.out.println(b);*/
        /*int c = articleMapperCustom.countArticleView(1);
        System.out.println(c);*/
        /*List<ArticleCustom>listArticle=articleMapperCustom.listArticle(1);
        System.out.println(listArticle);*/
        /*Article articleCustom = articleMapperCustom.getArticleById(1,2);
        System.out.println(articleCustom);*/
        /*ArticleCustom a1 = articleMapperCustom.a(1);
        System.out.println(a1);*/
        /*List<ArticleCustom> listArticleByPage=articleMapperCustom.listArticleByPage(1,1,3);
        System.out.println(listArticleByPage);*/
        /*Integer a =articleMapperCustom.getSearchResultCount(1,"springMVC");
        System.out.println(a);*/
        /*List<ArticleCustom> articleCustoms = articleMapperCustom.listSearchResultByPage(1,"springMVC",1,3);
        System.out.println(articleCustoms);*/
        /*ArticleCustom articleCustom = articleMapperCustom.getPreArticle(1,2);
        System.out.println(articleCustom);*/
        /*List<ArticleCustom> articleCustoms = articleMapperCustom.listRandomArticle(1,2);
        System.out.println(articleCustoms);*/
        /*Integer integer =articleMapperCustom.countArticleByTag(1,1);
        System.out.println(integer);*/
        //articleMapperCustom.updateCommentCount(3);
        /*ArticleCustom articleCustom=articleMapperCustom.getLastUpdateArticle();
        System.out.println(articleCustom);*/
        /*Integer integer = categoryMapperCustom.countCategory(1);
        System.out.println(integer);*/
        /*List<CategoryCustom> listCategory=categoryMapperCustom.listCategory(1);
        System.out.println(listCategory);*/
        /*Category getCategoryByName = categoryMapperCustom.getCategoryByName("java");
        System.out.println(getCategoryByName);*/
        /*List<CommentCustom> commentCustoms = commentMapperCustom.listCommentByArticleId(1,8);
        System.out.println(commentCustoms);*/
        /*List<LinkCustom>integer =linkMapperCustom.listLink(1);
        System.out.println(integer);*/
        /*List<MenuCustom> listMenu= menuMapperCustom.listMenu(1);
        System.out.println(listMenu);*/
        /*Integer integer = noticeMapperCustom.countNotice(1);
        System.out.println(integer);*/
        /*Options getOptions=optionsMapperCustom.getOptions();
        System.out.println(getOptions);*/
        /*List<PageCustom> listPage = pageMapperCustom.listPage(1);
        System.out.println(listPage);*/
        /*PageCustom getPageByKey=pageMapperCustom.getPageByKey(2,"map");
        System.out.println(getPageByKey);*/
        /*Integer integer = tagMapperCustom.countTag(1);
        System.out.println(integer);
        List<TagCustom> listTag = tagMapperCustom.listTag(1);
        System.out.println(listTag);
        List<ArticleCustom> listArticleWithTagByPage=tagMapperCustom.listArticleWithTagByPage(1,1,1,2);
        System.out.println(listArticleWithTagByPage);
        Tag getTagByName = tagMapperCustom.getTagByName("java");
        System.out.println(getTagByName);*/
        /*List<UserCustom> listUser=userMapperCustom.listUser();
        User getUserByNameOrEmail=userMapperCustom.getUserByNameOrEmail("821665225@qq.com");
        User getUserByName=userMapperCustom.getUserByName("test");
        User getUserByEmail=userMapperCustom.getUserByEmail("111111111@qq.com");
        Integer countArticleByUser=userMapperCustom.countArticleByUser(1);
        System.out.println(listUser);
        System.out.println(getUserByNameOrEmail);
        System.out.println(getUserByEmail);
        System.out.println(getUserByName);
        System.out.println(countArticleByUser);*/
        /*articleMapper.deleteByPrimaryKey(1);
        System.out.println(article);*/
        /*Article article =new Article();
        article.setArticle_id(40);
        article.setArticle_child_category_id(10);
        articleMapper.insert(article);*/
        //articleMapper.update(article);
        /*Category category = new Category();
        category.setCategory_id(40);
        category.setCategory_name("50");
        //categoryMapper.insert(category);
        categoryMapper.update(category);
        categoryMapper.deleteByPrimaryKey(40);*/
        /*Comment comment = new Comment();
        comment.setCommentId(50);
        comment.setCommentPid(60);
        //commentMapper.insert(comment);
        commentMapper.updateByPrimaryKey(comment);
        //commentMapper.deleteByPrimaryKey(50);*/
        /*Link link = new Link();
        link.setLink_id(50);
        link.setLink_name("40");
        //linkMapper.insert(link);
        //linkMapper.updateByPrimaryKey(link);
        linkMapper.deleteByPrimaryKey(50);*/
        /*Menu menu = new Menu();
        menu.setMenu_id(50);
        menu.setMenu_name("50");
        //menuMapper.insert(menu);
        //menuMapper.updateByPrimaryKey(menu);
        menuMapper.deleteByPrimaryKey(50);*/
        /*Notice notice = new Notice();
        notice.setNotice_id(50);
        notice.setNotice_content("50");
        //noticeMapper.insert(notice);
        //noticeMapper.updateByPrimaryKey(notice);
        noticeMapper.deleteByPrimaryKey(50);*/
        /*Options options = new Options();
        options.setOption_id(50);
        options.setOption_aboutsite_avatar("50");
        //optionsMapper.insert(options);
        //optionsMapper.updateByPrimaryKey(options);
        optionsMapper.deleteByPrimaryKey(50);*/
        /*Page page = new Page();
        Tag tag = new Tag();*/
        User user = new User();
        /*page.setPage_id(50);
        page.setPage_title("50");
        tag.setTag_id(50);
        tag.setTag_name("50");*/
        user.setUser_id(50);
        user.setUser_url("50");
        user.setUser_pass("50");
        user.setUser_nickname("50");
        user.setUser_name("50");
        System.out.println(user);
        //pageMapper.insert(page);
        //tagMapper.insert(tag);
        userMapper.insert(user);
        //*pageMapper.updateByPrimaryKey(page);
        //tagMapper.updateByPrimaryKey(tag);
       // userMapper.updateByPrimaryKey(user);
        /*pageMapper.deleteByPrimaryKey(50);
        tagMapper.deleteByPrimaryKey(50);
        userMapper.deleteByPrimaryKey(50);*/
        return "hello";
    }
    @RequestMapping("/")
    public String Index(Model model,HttpSession session) throws Exception{

        List<ArticleCustom> listArticle=articleMapperCustom.listArticle(1);
        model.addAttribute("listArticle",listArticle);
        List<ArticleCustom> listArticleByCommentCount=articleMapperCustom.listArticleByCommentCount(1,5);
        model.addAttribute("listArticleByCommentCount",listArticleByCommentCount);
        List<ArticleListVo> listArticleList=demoSqlProvider.listArticleList(1);
        model.addAttribute("listArticleList",listArticleList);
        Date date = new Date();
        session.setAttribute("date",date);
        String s = ".jpg";
        session.setAttribute("jpg",s);
        return "Home/index";
    }
    @RequestMapping("/tags")
    public String Index1(){

        return "Home/tags";
    }
    @RequestMapping("/readers")
    public String Reader(){

        return "Home/readers";
    }
    @RequestMapping("/links")
    public String Links(){

        return "Home/links";
    }
    @RequestMapping("/Admin/users")
    public String Users(Model model) throws  Exception{
        List<UserCustom> userList = userMapperCustom.listUser();
        for(int i=0;i<userList.size();i++) {
            Integer article_count = userMapperCustom.countArticleByUser(userList.get(i).getUser_id());
            userList.get(i).setArticleCount(article_count);
        }
        model.addAttribute("userList",userList);
        return "Admin/manage-user";
    }

    //退出登录
    @RequestMapping("/Admin/OutLogin")
    public String Out(){
        return "Admin/login";
    }

    //报告
    @RequestMapping("/Admin/Index")
    public String Index(){
        return "Admin/index";
    }

    //文章
    @RequestMapping("/Admin/Article")
    public String Article(Model model)throws Exception{
        int size = articleMapperCustom.countArticle(1);
        List<ArticleListVo> listArticleList=demoSqlProvider.listArticleList(1);
        model.addAttribute("listArticleList",listArticleList);
        model.addAttribute("size",size);
        return "Admin/article";
    }

    @RequestMapping("/Admin/flink")
    public String Flink(){

        return "Admin/flink";
    }

    @RequestMapping("/Admin/UserAdd")
    public String UserAdd(User user ,String RePassword,Model model) throws  Exception{
        user.setUser_last_login_time(new Date());
        user.setUser_register_time(new Date());
        user.setUser_status(1);
        user.setUser_last_login_ip("000.000.000");
        User UserByName=userMapperCustom.getUserByNameOrEmail(user.getUser_name());
        if (UserByName==null) {
            if (user.getUser_pass().equals(RePassword)) {
                userMapper.insert(user);
                List<UserCustom> userList = userMapperCustom.listUser();
                for (int i = 0; i < userList.size(); i++) {
                    Integer article_count = userMapperCustom.countArticleByUser(userList.get(i).getUser_id());
                    userList.get(i).setArticleCount(article_count);
                }
                model.addAttribute("userList", userList);
                return "Admin/manage-user";
            } else {
                return "error";
            }
        }else {
            System.out.println("用户名重复");
            return "error";
        }

    }

    @RequestMapping("/Admin/Update/{id}")
    public String UserUpdate(@PathVariable("id") Integer id,Model model) {
        User user = userMapper.selectByPrimaryKey(id);
        model.addAttribute("user",user);
        return "Admin/update-user";
    }

    @RequestMapping("/Admin/Delete/{id}")
    public String UserDelete(@PathVariable("id") Integer id,Model model) throws Exception {
        userMapper.deleteByPrimaryKey(id);
        List<UserCustom> userList = userMapperCustom.listUser();
        for(int i=0;i<userList.size();i++) {
            Integer article_count = userMapperCustom.countArticleByUser(userList.get(i).getUser_id());
            userList.get(i).setArticleCount(article_count);
        }
        model.addAttribute("userList",userList);
        return "Admin/manage-user";
    }


    @RequestMapping("/Admin/UserEmit/{id}")
    public String UserEmit(@PathVariable("id") Integer id,User user ,String RePassword,Model model) throws  Exception{
        User user1 = userMapper.selectByPrimaryKey(id);
        if(user.getUser_pass().equals(RePassword)){
            user.setUser_id(id);
            user.setUser_last_login_time(user1.getUser_last_login_time());
            user.setUser_url(user1.getUser_url());
            user.setUser_avatar(user1.getUser_avatar());
            user.setUser_register_time(user1.getUser_register_time());
            user.setUser_status(user1.getUser_status());
            userMapper.updateByPrimaryKey(user);
            List<UserCustom> userList = userMapperCustom.listUser();
            for(int i=0;i<userList.size();i++) {
                Integer article_count = userMapperCustom.countArticleByUser(userList.get(i).getUser_id());
                userList.get(i).setArticleCount(article_count);
            }
            model.addAttribute("userList",userList);
            return "Admin/manage-user";
        }else {
            return "error";}
    }
    @RequestMapping("/error/404")
    public String error(){

        return "error";
    }

    @RequestMapping("/Admin/Index/login")
    public  String Login(String username, String password, Model model,HttpServletRequest request) throws Exception{

        User user = userMapperCustom.getUserByName(username,password);
        if(user==null) {
            model.addAttribute("test","登录失败,密码或用户名错误");
            return "error";
        } else {
            int size = articleMapperCustom.countArticle(1);
            List<ArticleListVo> listArticleList=demoSqlProvider.listArticleList(1);
            model.addAttribute("listArticleList",listArticleList);
            model.addAttribute("size",size);
            request.getSession().setAttribute("user", user);
            return "Admin/article";
        }
    }
    //批量删除
    @RequestMapping("/Article/checkAll")
    public String  deleteArticles(String checkbox,Model model) throws Exception {

        String[] arr = checkbox.split(",");
        Integer[] ids = new Integer[arr.length];
        for(int i=0;i<arr.length;i++) {
            ids[i] = Integer.valueOf(arr[i]);
        }
        for (int i=0;i<ids.length;i++) {
            articleMapper.deleteByPrimaryKey(ids[i]);
        }
        int size = articleMapperCustom.countArticle(1);
        List<ArticleListVo> listArticleList=demoSqlProvider.listArticleList(1);
        model.addAttribute("listArticleList",listArticleList);
        model.addAttribute("size",size);
        return "Admin/article";

    }
    //删除
    @RequestMapping("/Article/delete/{id}")
    public String  delete(@PathVariable("id") Integer id,Model model) throws Exception {
        articleMapper.deleteByPrimaryKey(id);
        int size = articleMapperCustom.countArticle(1);
        List<ArticleListVo> listArticleList=demoSqlProvider.listArticleList(1);
        model.addAttribute("listArticleList",listArticleList);
        model.addAttribute("size",size);
        return "Admin/article";

    }
    //增加
    @RequestMapping("/Article/insert")
    public String  toInsert() throws Exception {

        return "Admin/add-article";

    }

    @RequestMapping("/Article/Insert")
    public String  ToInsert(Article article,String select,Model model) throws Exception {

        if(select.equals("Java基础") || select.equals("Core Java")|| select.equals("多线程并发编程")|| select.equals("Sockets和IO")|| select.equals("设计模式和反射")|| select.equals("JVM")|| select.equals("JavaWeb")|| select.equals("Java框架") ){
            article.setArticle_parent_category_id(1);
            if (select.equals("Java基础")){
                article.setArticle_child_category_id(2);
            }else if (select.equals("Core Java")){
                article.setArticle_child_category_id(3);
            }else if (select.equals("多线程并发编程")){
                article.setArticle_child_category_id(4);
            }else if (select.equals("Sockets和IO")){
                article.setArticle_child_category_id(5);
            }else if (select.equals("设计模式和反射")){
                article.setArticle_child_category_id(6);
            }else if (select.equals("JVM")){
                article.setArticle_child_category_id(7);
            }else if (select.equals("JavaWeb")){
                article.setArticle_child_category_id(8);
            }else if (select.equals("Java框架")){
                article.setArticle_child_category_id(9);
            }
        }else  if(select.equals("数据结构和算法") || select.equals("操作系统")|| select.equals("数据库")|| select.equals("计算机网络")){
            article.setArticle_parent_category_id(10);
            if (select.equals("数据结构和算法")){
                article.setArticle_child_category_id(11);
            }else if (select.equals("操作系统")){
                article.setArticle_child_category_id(12);
            }else if (select.equals("数据库")){
                article.setArticle_child_category_id(13);
            }else if (select.equals("计算机网络")){
                article.setArticle_child_category_id(14);
            }
        }else  if(select.equals("消息服务") || select.equals("缓存服务")|| select.equals("负载均衡")){
            article.setArticle_parent_category_id(15);
            if (select.equals("消息服务")){
                article.setArticle_child_category_id(16);
            }else if (select.equals("缓存服务")){
                article.setArticle_child_category_id(17);
            }else if (select.equals("负载均衡")){
                article.setArticle_child_category_id(18);
            }
        }else {
            article.setArticle_parent_category_id(20);
            article.setArticle_child_category_id(19);
        }
        article.setArticle_post_time(new Date());
        article.setArticle_update_time(new Date());
        article.setArticle_comment_count(1);
        article.setArticle_is_comment(1);
        article.setArticle_order(1);
        article.setArticle_status(1);
        article.setArticle_user_id(1);
        article.setArticle_view_count(1);
        article.setArticle_like_count(1);
        articleMapper.insert(article);
        int size = articleMapperCustom.countArticle(1);
        List<ArticleListVo> listArticleList=demoSqlProvider.listArticleList(1);
        model.addAttribute("listArticleList",listArticleList);
        model.addAttribute("size",size);
        return "Admin/article";

    }
    //修改
    @RequestMapping("/Article/toUpdate/{id}")
    public String  toUpdate(@PathVariable("id") Integer id,Model model) throws Exception {

        Article article = articleMapper.selectByPrimaryKey(id);
        model.addAttribute("article", article);
        return "Admin/update-article";

    }
    @RequestMapping("/Article/update/{id}")
    public String  Update(@PathVariable("id") Integer id,String select,Article article,Model model) throws Exception {
        article.setArticle_id(id);
        Article article1 = articleMapper.selectByPrimaryKey(id);
        article1.setArticle_title(article.getArticle_title());
        article1.setArticle_content(article.getArticle_content());
        article1.setArticle_update_time(new Date());
        if(select.equals("Java基础") || select.equals("Core Java")|| select.equals("多线程并发编程")|| select.equals("Sockets和IO")|| select.equals("设计模式和反射")|| select.equals("JVM")|| select.equals("JavaWeb")|| select.equals("Java框架") ){
            article1.setArticle_parent_category_id(1);
            if (select.equals("Java基础")){
                article1.setArticle_child_category_id(2);
            }else if (select.equals("Core Java")){
                article1.setArticle_child_category_id(3);
            }else if (select.equals("多线程并发编程")){
                article1.setArticle_child_category_id(4);
            }else if (select.equals("Sockets和IO")){
                article1.setArticle_child_category_id(5);
            }else if (select.equals("设计模式和反射")){
                article1.setArticle_child_category_id(6);
            }else if (select.equals("JVM")){
                article1.setArticle_child_category_id(7);
            }else if (select.equals("JavaWeb")){
                article1.setArticle_child_category_id(8);
            }else if (select.equals("Java框架")){
                article1.setArticle_child_category_id(9);
            }
        }else  if(select.equals("数据结构和算法") || select.equals("操作系统")|| select.equals("数据库")|| select.equals("计算机网络")){
            article1.setArticle_parent_category_id(10);
            if (select.equals("数据结构和算法")){
                article1.setArticle_child_category_id(11);
            }else if (select.equals("操作系统")){
                article1.setArticle_child_category_id(12);
            }else if (select.equals("数据库")){
                article1.setArticle_child_category_id(13);
            }else if (select.equals("计算机网络")){
                article1.setArticle_child_category_id(14);
            }
        }else  if(select.equals("消息服务") || select.equals("缓存服务")|| select.equals("负载均衡")){
            article1.setArticle_parent_category_id(15);
            if (select.equals("消息服务")){
                article1.setArticle_child_category_id(16);
            }else if (select.equals("缓存服务")){
                article1.setArticle_child_category_id(17);
            }else if (select.equals("负载均衡")){
                article1.setArticle_child_category_id(18);
            }
        }else {
            article1.setArticle_parent_category_id(20);
            article1.setArticle_child_category_id(19);
        }
        articleMapper.update(article1);
        int size = articleMapperCustom.countArticle(1);
        List<ArticleListVo> listArticleList=demoSqlProvider.listArticleList(1);
        model.addAttribute("listArticleList",listArticleList);
        model.addAttribute("size",size);
        return "Admin/article";

    }


    @RequestMapping("/Category/{id}")
    public  String Category(@PathVariable("id") Integer id,Model model)throws Exception{

        int pageSize = 10;
        List<ArticleListVo> listArticleList=demoSqlProvider.ListArticleWithCategoryByPage(1,null,pageSize,id);
        model.addAttribute("listArticleList",listArticleList);
        List<ArticleCustom> listArticleByCommentCount=articleMapperCustom.listArticleByCommentCount(1,5);
        model.addAttribute("listArticleByCommentCount",listArticleByCommentCount);
        return "Home/category";
    }
    @RequestMapping("/Article/{id}")
    public  String Article(@PathVariable("id") Integer id,Model model)throws Exception{

        Article article = articleMapperCustom.getArticleById(1,id);
        model.addAttribute("article",article);
        List<ArticleCustom> listArticleByCommentCount=articleMapperCustom.listArticleByCommentCount(1,5);
        model.addAttribute("listArticleByCommentCount",listArticleByCommentCount);

        //得到最后一篇得ID
        List<ArticleCustom> articles = articleMapperCustom.listArticle(1);

        /*if (articleMapperCustom.getArticleById(1,article.getArticle_id()-1)==null){
            model.addAttribute("prearticle",0);
        }else {
            model.addAttribute("prearticle",article.getArticle_id()-1);
        }*/
        /*if (articleMapperCustom.getArticleById(1,article.getArticle_id()+1)==null){
            model.addAttribute("aftarticle",0);
        }else {
            model.addAttribute("aftarticle",article.getArticle_id()+1);
        }*/

        //获取下一篇
        int pre = article.getArticle_id()-1;
        while (articleMapperCustom.getArticleById(1,pre)==null){
            pre--;
            if (pre<0){
                model.addAttribute("prearticle",0);
                break;
            }
        }if(articleMapperCustom.getArticleById(1,pre)!=null){
            model.addAttribute("prearticle",pre);
        }
        int aft = article.getArticle_id()+1;
        while (articleMapperCustom.getArticleById(1,aft)==null){
            aft++;
            if (aft>articles.get(0).getArticle_id()){
                model.addAttribute("aftarticle",0);
                break;
            }
        }if(articleMapperCustom.getArticleById(1,aft)!=null){
            model.addAttribute("aftarticle",aft);
        }

        return "Home/article";
    }

    @RequestMapping("/Home/Search")
    public String Search(String select,Model model) throws  Exception{
        List<ArticleCustom> articleCustoms =  articleMapperCustom.listSearchResultByPage(1,select);
        model.addAttribute("custom",articleCustoms);
        List<ArticleCustom> listArticleByCommentCount=articleMapperCustom.listArticleByCommentCount(1,5);
        model.addAttribute("listArticleByCommentCount",listArticleByCommentCount);
        return "Home/search";
    }
    @RequestMapping("/Home/comment")
    public String Comment(Comment comment, Model model) throws  Exception{

        return "Home/search";
    }




}
/*
<td>[[${#strings.substring(userphone,0,3)}]]<span>****</span>[[${#strings.substring(userphone,7,11)}]] </td>*/
