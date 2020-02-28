package com.niu.springbootmybatis.service;

import com.niu.springbootmybatis.model.RepalceDeadLock;
import java.util.List;

/**
 * @Author: niuhaijun
 * @Date: 2019-09-22 22:31
 * @Version 1.0
 */
public interface DeadLockService {

	int replace(List<RepalceDeadLock> repalceDeadLockList);


	int deleteAndInsert(RepalceDeadLock repalceDeadLockList);

}
