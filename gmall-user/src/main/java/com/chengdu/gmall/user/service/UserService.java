package com.chengdu.gmall.user.service;

import com.chengdu.gmall.user.bean.UmsMember;
import com.chengdu.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {


    List<UmsMember> getAllUser();
}
