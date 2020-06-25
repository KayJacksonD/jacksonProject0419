package com.it.jackson0419.controller;

import com.it.jackson0419.service.testService;
import com.it.jackson0419.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {
    @Autowired
    testService testService;

    /**
     * http://localhost:18081/test
     */
    @GetMapping(value = "/function")
    public void function() {
        String s = testService.function();
        System.out.println(s);
    }

    @GetMapping(value = "/findById/{id}")
    public void function2(@PathVariable int id) {
//        User user = testService.findById(id);
//        System.out.println(user);
        System.out.println("1550");
    }
}
