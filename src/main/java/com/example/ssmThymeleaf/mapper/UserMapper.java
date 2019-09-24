package com.example.ssmThymeleaf.mapper;

import com.example.ssmThymeleaf.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> list();
}
