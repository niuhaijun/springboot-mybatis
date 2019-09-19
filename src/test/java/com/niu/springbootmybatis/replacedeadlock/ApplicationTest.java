package com.niu.springbootmybatis.replacedeadlock;

import com.niu.springbootmybatis.mapper.RepalceDeadLockMapper;
import com.niu.springbootmybatis.model.RepalceDeadLock;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * musql repalce语法在高并发下的是死锁问题
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
  private RepalceDeadLockMapper mapper;

  @Test
  public void test() {

    ExecutorService threadPool = Executors.newFixedThreadPool(3);

    while (true) {
      for (int i = 1; i <= 3; i++) {

        RepalceDeadLock deadLock = new RepalceDeadLock();
        deadLock.setFid(i);
        deadLock.setContent(UUID.randomUUID().toString().replaceAll("-", ""));

        threadPool.execute(() -> mapper.replace(Collections.singletonList(deadLock)));
      }
    }
  }
}
