package com.boot.cn.service.serviceImpl;

import com.boot.cn.entity.User;
import com.boot.cn.mapper.UserMapper;
import com.boot.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author jiabing
 * @Package com.boot.cn.service.serviceImpl
 * @Description: ${todo}
 * @date 2018/6/20 14:08
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public User findById(Long id) {
        Optional<User> byId = userMapper.findById(id);
        return byId.get();
    }
}
