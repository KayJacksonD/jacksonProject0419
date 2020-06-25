package com.it.jackson0419.service.impl;

import com.it.jackson0419.dao.testDao;
import com.it.jackson0419.service.testService;
import com.it.jackson0419.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testServiceImpl implements testService {
    @Autowired(required = false)
    private testDao testDao;

    @Override
    public String function() {
        return "helloWorld";
    }

    @Override
    public User findById(int i) {
        User user = testDao.findById(i);
        return user;
    }
}
