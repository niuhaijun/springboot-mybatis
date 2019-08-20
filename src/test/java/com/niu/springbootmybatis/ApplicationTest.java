package com.niu.springbootmybatis;

import com.niu.springbootmybatis.mapper.TypeHandlerEnumMapper;
import com.niu.springbootmybatis.model.Task;
import com.niu.springbootmybatis.model.enums.Status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: niuhaijun
 * @Date: 2019-08-20 15:10
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

  @Autowired
  private TypeHandlerEnumMapper mapper;

  @Test
  public void test() {

    // id 是自增的，不用设置
    Task task = new Task(null, Status.LOGIN);
    mapper.save(task);

    mapper.queryAll().forEach(t -> {
      System.out.println(t.getId() + " " + t.getStatus().getCode() + " " + t.getStatus().getMsg());
    });
  }
}
