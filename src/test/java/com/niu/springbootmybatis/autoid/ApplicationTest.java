package com.niu.springbootmybatis.autoid;

import com.niu.springbootmybatis.mapper.AutoIdMapper;
import com.niu.springbootmybatis.mapper.TypeHandlerEnumMapper;
import com.niu.springbootmybatis.model.AutoId;
import com.niu.springbootmybatis.model.Task;
import com.niu.springbootmybatis.model.enums.Status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 获取自增ID
 *
 *
 * @Author: niuhaijun
 * @Date: 2019-08-20 15:10
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

  @Autowired
  private AutoIdMapper mapper;


  /**
   * SQL
   *
   * insert into spring_boot_auto_id (content) values (?)
   */
  @Test
  public void test_1() {

    AutoId ele = new AutoId();
    ele.setContent("123");
    int count = mapper.insertAndGetAutoIncId(ele);
    System.out.println(count + " --> " + ele.getAutoId());

  }

  /**
   * SQL
   *
   * insert into spring_boot_auto_id (auto_id, content) values (?, ?)
   */
  @Test
  public void test_2() {

    AutoId ele = new AutoId();

    /**
     * 如果ID有值，返回的自增ID为0
     *
     * 并且会插入成功
     */
    ele.setAutoId(null);
    ele.setContent("123");
    int count = mapper.insertAndGetAutoIncrementId(ele);
    System.out.println(count + " --> " + ele.getAutoId());
  }
}
