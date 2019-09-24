package com.example.ssmThymeleaf.service.impl;

import com.example.ssmThymeleaf.domain.User;
import com.example.ssmThymeleaf.mapper.UserMapper;
import com.example.ssmThymeleaf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
