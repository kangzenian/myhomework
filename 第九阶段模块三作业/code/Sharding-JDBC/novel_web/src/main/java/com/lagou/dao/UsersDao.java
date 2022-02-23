package com.lagou.dao;

import com.lagou.pojo.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UsersDao {

    /**
     * 添加用户
     */
    @Insert("insert into users(username, password, address) values(#{username}, #{password}, #{address})")
    public void insertUser(Users users);
}
