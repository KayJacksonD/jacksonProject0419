package com.it.jackson0419.service;

import com.it.jackson0419.vo.Menu;
import com.it.jackson0419.vo.User;

import java.util.List;

public interface IMenuService {

    List<Menu> getMenuList(User user);

    User getIcon(User user);
}
