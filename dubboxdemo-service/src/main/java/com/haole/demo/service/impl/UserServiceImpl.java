package com.haole.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.haole.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "haole";
    }
}
