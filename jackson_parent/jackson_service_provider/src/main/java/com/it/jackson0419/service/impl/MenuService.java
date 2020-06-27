package com.it.jackson0419.service.impl;

import com.it.jackson0419.dao.IMenuDao;
import com.it.jackson0419.dao.testDao;
import com.it.jackson0419.service.IMenuService;
import com.it.jackson0419.service.testService;
import com.it.jackson0419.vo.Menu;
import com.it.jackson0419.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService implements IMenuService {
    @Autowired(required = false)
    IMenuDao menuDao;

    @Override
    public List<Menu> getMenuList(User user) {
        return menuDao.getMenuList(user);
    }

    @Override
    public User getIcon(User user) {
        return menuDao.getIcon(user);
    }
}
