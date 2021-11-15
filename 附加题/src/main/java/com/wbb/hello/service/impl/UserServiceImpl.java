package com.wbb.hello.service.impl;

import com.wbb.hello.mapper.HelloMapper;
import com.wbb.hello.pojo.Hello;
import com.wbb.hello.pojo.HelloExample;
import com.wbb.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private HelloMapper helloMapper;


    @Override
    public List<Hello> findAll() {
        HelloExample helloExample = new HelloExample();

        helloExample.or().andAgeIsNotNull();

        List<Hello> hellos = helloMapper.selectByExample(helloExample);

        return hellos;
    }

    @Override
    public List<Hello> findByAge(String age) {
        HelloExample helloExample = new HelloExample();

        helloExample.or().andAgeEqualTo(age);

        List<Hello> hellos = helloMapper.selectByExample(helloExample);

        return hellos;
    }
}
