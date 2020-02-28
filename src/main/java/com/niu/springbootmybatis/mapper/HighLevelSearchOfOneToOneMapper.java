package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.controller.vo.SysUserVO;

/**
 * @author: niuhaijun
 * @date: 2019-11-06 10:49
 * @version: 1.0
 * @description: 高级查询 一对一
 */
public interface HighLevelSearchOfOneToOneMapper {


	/**
	 * 根据用户 id 获取用户信息和用户的角色信息
	 *
	 *
	 * 使用自动映射处理一对一关系
	 */
	SysUserVO selectUserAndRoleById1(Long id);

	/**
	 * 根据用户 id 获取用户信息和用户的角色信息
	 *
	 *
	 * 使用resultMap处理一对一关系
	 */
	SysUserVO selectUserAndRoleById2(Long id);


	/**
	 * 根据用户 id 获取用户信息和用户的角色信息
	 *
	 *
	 * 使用resultMap处理一对一关系
	 *
	 * 使用已有的的resultMap简化配置
	 */
	SysUserVO selectUserAndRoleById3(Long id);


}
