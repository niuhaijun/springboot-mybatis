package com.niu.springbootmybatis.controller;

import com.github.pagehelper.PageHelper;
import com.niu.springbootmybatis.mapper.UsersMapper;
import com.niu.springbootmybatis.model.Users;
import com.niu.springbootmybatis.model.UsersExample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-10 21:00
 * @Version 1.0
 */
@RestController
@RequestMapping
public class HelloController {

  @Autowired
  private UsersMapper usersMapper;


  @RequestMapping("/user")
  public List<Users> get() {
    UsersExample example = new UsersExample();
    example.createCriteria().andIdEqualTo("1");

    PageHelper.startPage(1, 20);

    return usersMapper.selectByExample(example);
  }

}
