package com.lagou.dao;

import com.lagou.pojo.SysRegion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface SysRegionDao {

    /**
     * 添加区域
     */
    @Insert("insert into sys_region(region_name, region_code, region_level) values(#{region_name}, #{region_code}, #{region_level})")
    public void insertRegion(SysRegion sysRegion);
}
