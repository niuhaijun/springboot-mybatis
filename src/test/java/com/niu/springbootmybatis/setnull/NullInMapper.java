package com.niu.springbootmybatis.setnull;

import com.niu.springbootmybatis.mapper.NullEmptyMapper;
import com.niu.springbootmybatis.model.NullEmpty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: niuhaijun
 * @Date: 2019-09-29 19:31
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NullInMapper {

  @Autowired
  private NullEmptyMapper mapper;

  // [1	null]
  @Test
  public void setNull() {

    NullEmpty nullEmpty = new NullEmpty();
    mapper.insert(nullEmpty);
  }

  // [2 ""]
  @Test
  public void setEmptyStr() {

    NullEmpty nullEmpty = new NullEmpty();
    nullEmpty.setContent("");
    mapper.insert(nullEmpty);
  }

  // [3	null]
  @Test
  public void insertNull() {

    mapper.insertNull();
  }

  // [4 ""]
  @Test
  public void insertEmpty() {

    mapper.insertEmpty();
  }


  // [5 5]
  // [6 6]
  @Test
  public void normalInsert() {

    NullEmpty nullEmpty = new NullEmpty();
    nullEmpty.setContent("5");
    mapper.insert(nullEmpty);

    nullEmpty = new NullEmpty();
    nullEmpty.setContent("6");
    mapper.insert(nullEmpty);
  }

  // [5 5] -> [5 null]
  @Test
  public void updateNull() {

    mapper.updateNull(5);

  }

  // [6 6] -> [6 ""]
  @Test
  public void updateEmpty() {

    mapper.updateEmpty(6);
  }


}
