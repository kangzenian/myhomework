package com.lagou.dao;

import com.lagou.pojo.Novel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface NovelDao {

    /**
     * 新增小说
     */
    @Insert("insert into novel(id,title,author,pic,content) values(#{id}, #{title}, #{author}, #{pic}, #{content})")
    public void NovelInsert(Novel novel);

    /**
     * 根据id查询小说
     */
    @Select("select * from novel where id = #{id}")
    public Novel findNovelById(@Param("id") Long id);
}
