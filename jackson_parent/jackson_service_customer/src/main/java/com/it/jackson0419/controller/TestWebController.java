package com.it.jackson0419.controller;


import com.it.jackson0419.vo.Menu;
import com.it.jackson0419.vo.ResultVO;
import com.it.jackson0419.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/customer")
public class TestWebController {
    @Autowired
    RestTemplate restTemplate;

    /**
     * http://localhost:10080/customer/customer/findById?id=2
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/findById")
    public User function2(@RequestParam int id) {
        String url = "http://jackson-provider/test/findById/" + id;
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }

    /**
     * http://localhost:10080/customer/customer/findById?id=2
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/getMenuList")
    public ResultVO getMenuList(@RequestParam int id) {
        String url = "http://jackson-provider/test/findById/" + id;
        return restTemplate.getForObject(url, ResultVO.class);
    }
}
