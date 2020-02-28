package com.niu.springbootmybatis.service.impl;

import com.niu.springbootmybatis.mapper.RepalceDeadLockMapper;
import com.niu.springbootmybatis.model.RepalceDeadLock;
import com.niu.springbootmybatis.model.RepalceDeadLockExample;
import com.niu.springbootmybatis.service.DeadLockService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: niuhaijun
 * @Date: 2019-09-22 22:33
 * @Version 1.0
 */
@Service
public class DeadLockServiceImpl implements DeadLockService {

	@Autowired
	private RepalceDeadLockMapper mapper;

	@Transactional(isolation = Isolation.REPEATABLE_READ)
	@Override
	public int replace(List<RepalceDeadLock> repalceDeadLockList) {

		return mapper.replace(repalceDeadLockList);
	}

	@Transactional(isolation = Isolation.REPEATABLE_READ)
	@Override
	public int deleteAndInsert(RepalceDeadLock deadLock) {

		RepalceDeadLockExample para1 = new RepalceDeadLockExample();
		para1.createCriteria().andFidEqualTo(deadLock.getFid());
		int deleteNum = mapper.deleteByExample(para1);
		int insertNum = mapper.insertSelective(deadLock);

		return deleteNum + insertNum;
	}


}
