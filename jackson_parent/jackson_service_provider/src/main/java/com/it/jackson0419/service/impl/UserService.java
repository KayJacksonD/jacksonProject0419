package com.it.jackson0419.service.impl;

import com.it.jackson0419.dao.IPermissionDao;
import com.it.jackson0419.dao.IUserDao;
import com.it.jackson0419.service.IPermissionService;
import com.it.jackson0419.service.IUserService;
import com.it.jackson0419.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired(required = false)
    IUserDao userDao;

    @Override
    public User getUserByUserId(Long userId) {
        User userVO = userDao.getUserByUserId(userId);
        return userVO;
    }
}
