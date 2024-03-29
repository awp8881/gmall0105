package com.chengdu.gmall.user.service.impl;

import com.chengdu.gmall.user.bean.UmsMember;
import com.chengdu.gmall.user.mapper.UserMapper;
import com.chengdu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
    }
}
