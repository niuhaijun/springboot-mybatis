package com.niu.springbootmybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.niu.springbootmybatis.controller.param.UserPara;
import com.niu.springbootmybatis.controller.vo.UserVO;
import com.niu.springbootmybatis.mapper.UserMapper;
import com.niu.springbootmybatis.model.User;
import com.niu.springbootmybatis.model.UserExample;
import com.niu.springbootmybatis.service.UserService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 15:14
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public Integer add(UserPara userPara) {

		Date date = new Date();
		userPara.setCreateTime(date);
		userPara.setUpdateTime(date);

		User user = new User();
		BeanUtils.copyProperties(userPara, user);
		return userMapper.insertSelective(user);
	}

	@Override
	public Integer update(UserPara userPara) {

		userPara.setUpdateTime(new Date());
		User user = new User();
		BeanUtils.copyProperties(userPara, user);

		UserExample example = new UserExample();
		example.createCriteria().andIdEqualTo(userPara.getId());
		return userMapper.updateByExampleSelective(user, example);
	}

	@Override
	public Integer logicDelete(UserPara userPara) {

		User user = new User();
		user.setUsed(0);
		user.setUpdateTime(new Date());

		UserExample example = new UserExample();
		example.createCriteria().andIdEqualTo(userPara.getId());

		return userMapper.updateByExampleSelective(user, example);
	}

	@Override
	public Integer delete(UserPara userPara) {

		return userMapper.deleteByPrimaryKey(userPara.getId());
	}

	@Override
	public List<UserVO> select(UserPara userPara) {

		UserExample example = new UserExample();
		example.createCriteria().andUsedEqualTo(1);

		List<User> userList = userMapper.selectByExample(example);
		List<UserVO> result = new ArrayList<>(userList.size());
		userList.forEach(t -> {
			UserVO userVO = new UserVO();
			BeanUtils.copyProperties(t, userVO);
			result.add(userVO);
		});

		return result;
	}

	@Override
	public PageInfo<UserVO> pagedSelect(UserPara userPara) {

		UserExample example = new UserExample();
		example.createCriteria().andUsedEqualTo(1);

		/**
		 * 将参数传给这个方法就可以实现物理分页了，非常简单。
		 */
		PageHelper.startPage(userPara.getPageNum(), userPara.getPageSize());
		List<UserVO> result = select(userPara);

		PageInfo<UserVO> pageInfo = new PageInfo<>(result);
		return pageInfo;
	}

}
