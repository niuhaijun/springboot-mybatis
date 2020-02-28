package com.niu.springbootmybatis.controller;

import com.alibaba.fastjson.JSON;
import com.niu.springbootmybatis.mapper.EqualityMapper;
import com.niu.springbootmybatis.model.Equality;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-12 15:10
 * @Version 1.0
 */
@RestController
@RequestMapping("/equality")
public class EqualityController {

	private static final Logger logger = LoggerFactory.getLogger(EqualityController.class);

	@Autowired
	private EqualityMapper equalityMapper;

	@RequestMapping("/testEquals")
	public List<Equality> testEquals(Equality equality) {

		logger.info("testEquals->param:【param->{}】", JSON.toJSONString(equality));
		List<Equality> result = equalityMapper.testEquals(equality);

		return result;
	}

}
