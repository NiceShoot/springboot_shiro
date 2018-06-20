package com.boot.cn.vo;

import com.boot.cn.common.base.BaseVo;

import java.io.Serializable;

/**
 * @author jiabing
 * @Package com.boot.cn.vo
 * @Description: ${todo}
 * @date 2018/6/20 14:31
 */
public class UserVo extends BaseVo implements Serializable{

    private Long id;

    private String userName;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
