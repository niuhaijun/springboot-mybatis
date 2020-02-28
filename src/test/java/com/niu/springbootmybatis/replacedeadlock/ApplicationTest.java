package com.niu.springbootmybatis.replacedeadlock;

import com.niu.springbootmybatis.mapper.RepalceDeadLockMapper;
import com.niu.springbootmybatis.model.RepalceDeadLock;
import com.niu.springbootmybatis.model.RepalceDeadLockExample;
import com.niu.springbootmybatis.service.DeadLockService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

	/**
	 * 数据量
	 */
	private static final int RECORD_COUNT = 100_000;
	@Autowired
	private RepalceDeadLockMapper mapper;
	@Autowired
	private DeadLockService deadLockService;

	/**
	 * replace死锁演示
	 */
	@Test
	public void test() {

		ExecutorService threadPool = Executors.newFixedThreadPool(2);

		while (true) {

//      try {
//        Thread.sleep(10);
//      }
//      catch (InterruptedException e) {
//        e.printStackTrace();
//      }

			for (int fid = 1; fid <= 2; fid++) {

				RepalceDeadLock deadLock = new RepalceDeadLock();
				deadLock.setFid(fid);
				deadLock.setContent(UUID.randomUUID().toString().replaceAll("-", ""));

				threadPool.execute(() -> mapper.replace(Collections.singletonList(deadLock)));

//        threadPool.execute(() -> deadLockService.replace(Collections.singletonList(deadLock)));

//        threadPool.execute(() -> deadLockService.deleteAndInsert(deadLock));

			}
		}
	}


	/**
	 * insert死锁演示
	 */
	@Test
	public void insetWithUpdate() {

		ExecutorService threadPool = Executors.newFixedThreadPool(2);

		while (true) {

			for (int fid = 1; fid <= 3; fid++) {

				RepalceDeadLock deadLock = new RepalceDeadLock();
				deadLock.setFid(fid);
				deadLock.setContent(UUID.randomUUID().toString().replaceAll("-", ""));

				threadPool.execute(() -> mapper.insertWithUpdate(deadLock));
			}
		}
	}


	/**
	 * 批量构建数据
	 */
	@Test
	public void insertData() {

		RepalceDeadLockExample example = new RepalceDeadLockExample();
		mapper.deleteByExample(example);

		List<RepalceDeadLock> list = new ArrayList<>(RECORD_COUNT);
		for (int fid = 1; fid <= RECORD_COUNT; fid++) {
			RepalceDeadLock deadLock = new RepalceDeadLock();
			deadLock.setFid(fid);
			deadLock.setContent(UUID.randomUUID().toString().replaceAll("-", ""));
			list.add(deadLock);
		}
		int num = mapper.batchInsert(list);
		System.out.println(num);
	}
}
