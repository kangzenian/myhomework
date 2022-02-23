package com.lagou.test;

import com.lagou.NovelApplication;
import com.lagou.dao.SysRegionDao;
import com.lagou.pojo.SysRegion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NovelApplication.class)
public class SysRegionDaoTest {

    @Autowired
    private SysRegionDao sysRegionDao;

    /**
     * 测试添加
     */
    @Test
    public void TestInsert() {

        SysRegion sysRegion = new SysRegion();

        sysRegion.setRegion_name("上海");
        sysRegion.setRegion_code("101");
        sysRegion.setRegion_level(1);

        sysRegionDao.insertRegion(sysRegion);
    }
}
