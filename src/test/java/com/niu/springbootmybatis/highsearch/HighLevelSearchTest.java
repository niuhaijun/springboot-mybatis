package com.niu.springbootmybatis.highsearch;

import com.niu.springbootmybatis.controller.vo.SysUserVO;
import com.niu.springbootmybatis.mapper.HighLevelSearchMapper;
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
 * @description: xxx
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class HighLevelSearchTest {

  @Autowired
  private HighLevelSearchMapper mapper;

  /**
   * 1对1
   */
  @Test
  public void test1() {

    SysUserVO userVO = mapper.selectUserAndRoleById1(1001L);
    log.info("userVO = {}", userVO);
  }

  @Test
  public void test2() {
    SysUserVO userVO = mapper.selectUserAndRoleById2(1001L);
    log.info("userVO = {}", userVO);
  }

  @Test
  public void test3() {
    SysUserVO userVO = mapper.selectUserAndRoleById3(1001L);
    log.info("userVO = {}", userVO);
  }


}
