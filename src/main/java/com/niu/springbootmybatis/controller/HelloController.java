package com.niu.springbootmybatis.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.niu.springbootmybatis.mapper.UserMapper;
import com.niu.springbootmybatis.model.User;
import com.niu.springbootmybatis.model.UserExample;
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
  private UserMapper usersMapper;


  @RequestMapping("/user")
  public PageInfo<User> get() {

    UserExample example = new UserExample();
    example.createCriteria().andIdEqualTo("1");

    PageHelper.startPage(1, 20);
    List<User> userEntities = usersMapper.selectByExample(example);
    PageInfo<User> pageInfo = new PageInfo<>(userEntities);

    return pageInfo;
  }

}
