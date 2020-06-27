package com.it.jackson0419.dao;

import com.it.jackson0419.vo.Menu;
import com.it.jackson0419.vo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IMenuDao {
    List<Menu> getMenuList(@Param("vo") User vo);

    User getIcon(@Param("vo") User user);
}
