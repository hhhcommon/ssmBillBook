package com.copasso.billbook.controller;

import com.copasso.billbook.bean.BUser;
import com.copasso.billbook.service.BUserService;
import com.copasso.billbook.utils.MDUtils;
import com.copasso.billbook.utils.MailUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.NoSuchAlgorithmException;

/**
 * 用户User控制类
 */
@Controller
@RequestMapping("user")
public class BUserController {

    @Autowired
    private BUserService bUserService;

    /**
     * 返回用户列表页面
     *
     * @return
     */
    @RequestMapping("")
    public String userlist() {
        return "userlist";
    }

    /**
     * 添加用户，返回状态值
     *
     * @param username
     * @param budget
     * @return
     */
    @RequestMapping("sign")
    @ResponseBody
    public BUser signup(@Param("id") String id, @Param("username") String username,
                        @Param("budget") Float budget) {
        return bUserService.register(new BUser(id, username, budget));
    }

    /**
     * 更新用户信息
     *
     * @param id
     * @param username
     * @param budget
     * @return
     */
    @RequestMapping("update")
    @ResponseBody
    public BUser updateUser(@Param("id") String id, @Param("username") String username,
                            @Param("budget") Float budget) {
        int result = bUserService.updateUser(new BUser(id, username, budget));
        BUser user = bUserService.findUserById(id);
        user.setSuccess();
        if (result == 0)
            //result：影响行数，若为0即为失败
            user.setFail();
        return user;
    }

    /**
     * 根据name查询用户
     *
     * @param name
     * @return
     */
    @RequestMapping("name/{name}")
    @ResponseBody
    public BUser lookupUserByName(@PathVariable("name") String name) {
        return bUserService.findUserByUserName(name);
    }
}
