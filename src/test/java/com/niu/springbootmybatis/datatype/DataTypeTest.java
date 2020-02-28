package com.niu.springbootmybatis.datatype;

import com.niu.springbootmybatis.mapper.DataTypeMapper;
import com.niu.springbootmybatis.model.DataType;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: niuhaijun
 * @date: 2019-11-06 17:27
 * @version: 1.0
 * @description: xxx
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DataTypeTest {

	@Autowired
	private DataTypeMapper mapper;

	@Test
	public void save() {

		String str = "0";

		for (long i = 0; i < Long.MAX_VALUE; i++) {
			str += str;
			log.info("current len is {}", str.length());
			mapper.insert(new DataType(null, str));
		}
	}
}
