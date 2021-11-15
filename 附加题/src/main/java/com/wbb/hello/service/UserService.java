package com.wbb.hello.service;

import com.wbb.hello.pojo.Hello;

import java.util.List;

public interface UserService {

    List<Hello> findAll();

    List<Hello> findByAge(String age);
}
