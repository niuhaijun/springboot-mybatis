package com.niu.springbootmybatis.mapperargs;

import com.niu.springbootmybatis.mapper.AutoIdMapper;
import com.niu.springbootmybatis.model.AutoId;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 接口参数的个数
 *
 * 注意mapper中的参数名称
 *
 *
 * @Author: niuhaijun
 * @Date: 2019-10-28 23:19
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperArgs {

  @Autowired
  private AutoIdMapper mapper;

  // 单个， 基本数据类型
  // 方法参数名称 与 mapper中的名称可以不一致
  // 但是最好一致
  @Test
  public void test1() {

    Integer uid = 3;
    AutoId ele = mapper.selectByPrimaryKey(uid);
    System.out.println(ele);
  }

  // 单个， javabean
  // bean属性名称 必须与 mapper中的名称一致
  @Test
  public void test2() {

    AutoId record = new AutoId();
    record.setContent("anc");
    int count = mapper.insertSelective(record);
    System.out.println(count);
  }

  // 单个，javabean 使用@Param
  @Test
  public void test3() {

    AutoId record = new AutoId();
    record.setContent("anc");
    int count = mapper.insertSelectiveWithParam(record);
    System.out.println(count);
  }

  @Test
  public void test() {

    Map<String, Object> map = new HashMap<>();
    map.put("p1", 0);
    map.put("p2", "abcd");

    int count = mapper.insertSelectiveWithMap(map);
    System.out.println(count);
  }

}
