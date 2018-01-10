package com.jcbz.service.bas.impl;

import com.jcbz.bean.entity.Tuser;
import com.jcbz.dao.bas.UserDao;
import com.jcbz.service.bas.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * XXX
 *
 * @author fyc
 * @time 2018/1/4
 * @copyright Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public Tuser selectUserById(Integer userId) {
        return userDao.selectUserById(userId);
    }
}
