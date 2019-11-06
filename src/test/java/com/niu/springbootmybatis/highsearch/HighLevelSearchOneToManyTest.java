package com.niu.springbootmybatis.highsearch;

import com.niu.springbootmybatis.controller.vo.SysUserVO;
import com.niu.springbootmybatis.mapper.HighLevelSearchOfOneToManyMapper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: niuhaijun
 * @date: 2019-11-06 11:01
 * @version: 1.0
 * @description: 高级查询 1 对 多，还支持嵌套
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class HighLevelSearchOneToManyTest {

  @Autowired
  private HighLevelSearchOfOneToManyMapper mapper;

  @Test
  public void test1() {

    List<SysUserVO> list = mapper.selectAllUserAndRoleList();
    System.out.println(list.size());
  }


  @Test
  public void test2() {

    List<SysUserVO> list = mapper.selectAllUserAndRoleList1();
    System.out.println(list.size());
  }

}
