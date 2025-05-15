package com.yhllx999.webdiaryboot.mapper;

import com.yhllx999.webdiaryboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    public User findById(int id);
}
