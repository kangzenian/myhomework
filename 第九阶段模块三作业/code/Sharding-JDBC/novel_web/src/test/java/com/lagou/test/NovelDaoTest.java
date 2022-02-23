package com.lagou.test;

import com.lagou.NovelApplication;
import com.lagou.dao.NovelDao;
import com.lagou.pojo.Novel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NovelApplication.class)
public class NovelDaoTest {

    @Autowired
    private NovelDao novelDao;

    /**
     * 测试新增
     */
    @Test
    public void testInsert() {

        Novel novel = new Novel();
        for (int i = 0; i < 5; i++) {

            novel.setId(201L + i);
            novel.setTitle("三国演义" + i);
            novel.setAuthor("罗贯中");
            novel.setPic("99.9");
            novel.setContent("四大名著之一");
            novelDao.NovelInsert(novel);
        }
    }

    /**
     * 测试查询
     */
    @Test
    public void testQuery() {

        Novel novel = novelDao.findNovelById(1L);
        System.out.println("novel = " + novel);
    }
}
