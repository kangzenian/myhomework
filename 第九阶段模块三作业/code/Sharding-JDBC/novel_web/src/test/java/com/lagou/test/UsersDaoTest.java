package com.lagou.test;

import com.lagou.NovelApplication;
import com.lagou.dao.UsersDao;
import com.lagou.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NovelApplication.class)
public class UsersDaoTest {

    @Autowired
    private UsersDao usersDao;

    /**
     * 测试添加
     */
    @Test
    public void testInsert() {

        Users user = new Users();

        for (int i = 0; i < 100; i++) {
            user.setUsername("张飞" + i);
            user.setPassword("123456");
            user.setAddress("三国" + i);

            usersDao.insertUser(user);
        }
    }
}
