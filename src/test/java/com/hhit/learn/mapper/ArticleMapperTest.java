package com.hhit.learn.mapper;

import com.github.pagehelper.PageHelper;
import com.hhit.learn.entity.ArticleEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * The type Article mapper test.
 *
 * @program: learn
 * @description: 文章的Mapper测试类
 * @author: GeekYe
 * @create: 2018 -04-16 22:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleMapperTest {

    @Autowired
    private ArticleMapper articleMapper;

    /**
     * Sets article mapper.
     *
     * @param articleMapper the article mapper
     */
    public void setArticleMapper(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    /**
     * Save article test.
     */
    @Test
    public void saveArticleTest(){

        for (int i = 0; i < 100; i++) {
            articleMapper.saveArticle(16,"12:00",
                    "测试","测试","测试");
        }

    }

    /**
     * List articles on home test.
     */
    @Test
    public void listArticlesOnHomeTest(){
        List<ArticleEntity> articleEntities = articleMapper.listArticlesOnHome();
        for (ArticleEntity a : articleEntities
             ) {
            System.out.println(a.toString());
        }
    }

    /**
     * Get article by id.
     */
    @Test
    public void getArticleByIdTest(){
        ArticleEntity articleEntity = articleMapper.getArticleById(3);
        System.out.println(articleEntity.toString());
    }

    @Test
    public void listArticlesByPageHelperTest(){
        PageHelper.startPage(1,5);
        List<ArticleEntity> articleEntities = articleMapper.listArticlesByCategory("测试");

        for (ArticleEntity a:articleEntities
             ) {
            System.out.println(a.toString());
        }
    }
}