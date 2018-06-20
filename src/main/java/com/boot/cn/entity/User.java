package com.boot.cn.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author jiabing
 * @Package com.boot.cn.entity
 * @Description: ${todo}
 * @date 2018/6/20 13:44
 */
@Entity
@Table(name = "user")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name",length = 64)
    private String userName;

    @Column(name = "password",length = 200)
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
