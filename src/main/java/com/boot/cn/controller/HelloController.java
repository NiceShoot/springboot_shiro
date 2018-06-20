package com.boot.cn.controller;

import com.boot.cn.common.util.ConversionUtil;
import com.boot.cn.entity.User;
import com.boot.cn.service.UserService;
import com.boot.cn.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jiabing
 * @Package com.boot.cn.controller
 * @Description: ${todo}
 * @date 2018/6/20 13:44
 */
@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        User byId = userService.findById(1L);
        UserVo userVo = ConversionUtil.Po2Dto(UserVo.class, byId);
        return byId.getUserName()+userVo.getPassword();
    }
}
