package com.niu.springbootmybatis.mapper;


import com.niu.springbootmybatis.model.User;
import java.util.List;

public interface UserMapper {

  List<User> findUserList();

}