package com.niu.springbootmybatis.transaction;

import com.niu.springbootmybatis.mapper.AutoIdMapper;
import com.niu.springbootmybatis.model.AutoId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: niuhaijun
 * @date: 2020/2/28 11:13
 * @version: 1.0
 * @description: xxx
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionTest {

	@Autowired
	private AutoIdMapper mapper;


	@Test
	public void test_1() {

		AutoId ele = new AutoId();
		ele.setContent("123");
		int count = mapper.insertAndGetAutoIncId(ele);
		System.out.println(count + " --> " + ele.getAutoId());

	}

	@Test
	@Transactional
	public void test_2() {

		AutoId ele = new AutoId();
		ele.setContent("123");
		int count = mapper.insertAndGetAutoIncId(ele);
		System.out.println(count + " --> " + ele.getAutoId());
	}

}
