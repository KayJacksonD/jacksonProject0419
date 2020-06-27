package com.it.jackson0419.controller;

import com.it.jackson0419.service.IMenuService;
import com.it.jackson0419.service.testService;
import com.it.jackson0419.utils.ResultUtil;
import com.it.jackson0419.vo.Menu;
import com.it.jackson0419.vo.ResultVO;
import com.it.jackson0419.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/menuController")
public class MenuController {
    @Autowired
    IMenuService menuService;

    /**
     * 获取菜单集合
     * http://localhost:18081/test
     */
    @PostMapping(value = "/getMenuList")
    public ResultVO getMenuList(@RequestBody User user) {
        List<Menu> menuList = menuService.getMenuList(user);
        return ResultUtil.returnResult(menuList);
    }

    /**
     * 获取用户头像
     * http://localhost:18081/test
     */
    @PostMapping(value = "/getIcon")
    public ResultVO getIcon(@RequestBody User user) {
        user = menuService.getIcon(user);
        return ResultUtil.returnResult(user);
    }
}
