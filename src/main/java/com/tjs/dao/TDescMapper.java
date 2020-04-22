package com.tjs.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TDescMapper {
     @Insert("insert into t_desc(desc_type,desc_value,desc_name) values (#{descType},#{descValue},#{descName})")
    int insertDesc(@Param("descType") String descType, @Param("descValue")String descValue,@Param("descName") String descName);
}
