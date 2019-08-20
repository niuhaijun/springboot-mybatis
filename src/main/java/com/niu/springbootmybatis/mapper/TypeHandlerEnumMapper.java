package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.Task;
import java.util.List;

/**
 * @Author: niuhaijun
 * @Date: 2019-08-20 15:03
 * @Version 1.0
 */
public interface TypeHandlerEnumMapper {

  void save(Task task);

  List<Task> queryAll();

}
