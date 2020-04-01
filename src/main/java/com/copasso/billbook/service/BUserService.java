package com.copasso.billbook.service;

import com.copasso.billbook.bean.BUser;
import com.copasso.billbook.dao.BUserMapper;
import com.copasso.billbook.utils.MDUtils;
import com.copasso.billbook.utils.MailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * 用户User服务类
 */
@Service
public class BUserService {

    @Autowired
    private BUserMapper bUserMapper;

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    public BUser register(BUser user) {
        BUser user2 = bUserMapper.selectByUserName(user.getUsername());
        user.setSuccess();
        if (user2 != null) {
            user.setFail("用户名已经存在");
            return user;
        }
        user2 = user;
        user2.setSuccess();
        user2.setBudget(user.getBudget());
        user2.setState(1);
        bUserMapper.insert(user2);
        return user2;
    }

    /**
     * 根据用户id查询用户
     *
     * @param id
     * @return
     */
    public BUser findUserById(String id) {
        return bUserMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据用户username查询用户
     *
     * @param name
     * @return
     */
    public BUser findUserByUserName(String name) {
        BUser user = bUserMapper.selectByUserName(name);
        if (user == null) {
            user = new BUser();
            user.setFail("用户名不存在");
            return user;
        }
        return user;
    }

    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    public int updateUser(BUser user) {
        return bUserMapper.updateByPrimaryKeySelective(user);
    }
}
