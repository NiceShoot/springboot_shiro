package com.boot.cn.mapper;

import com.boot.cn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author jiabing
 * @Package com.boot.cn.mapper
 * @Description: ${todo}
 * @date 2018/6/20 14:00
 */
public interface UserMapper extends JpaRepository<User, Long> {

    public Optional<User> findById(Long id);
}
