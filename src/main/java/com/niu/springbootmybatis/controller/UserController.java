package com.niu.springbootmybatis.controller;

import com.github.pagehelper.PageInfo;
import com.niu.springbootmybatis.controller.param.UserPara;
import com.niu.springbootmybatis.controller.vo.UserVO;
import com.niu.springbootmybatis.service.UserService;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 15:26
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/add")
	public Integer add(UserPara userPara) {

		userPara.setId(UUID.randomUUID().toString().replaceAll("-", "").toLowerCase());
		return userService.add(userPara);
	}

	@RequestMapping("/update")
	public Integer update(UserPara userPara) {

		return userService.update(userPara);
	}

	@RequestMapping("/logicDelete")
	public Integer logicDelete(UserPara userPara) {

		return userService.logicDelete(userPara);
	}

	@RequestMapping("/delete")
	public Integer delete(UserPara userPara) {

		return userService.delete(userPara);
	}

	@RequestMapping("/select")
	public List<UserVO> select(UserPara userPara) {

		return userService.select(userPara);
	}

	@RequestMapping("/pagedSelect")
	public PageInfo<UserVO> pagedSelect(UserPara userPara) {

		return userService.pagedSelect(userPara);
	}

}
