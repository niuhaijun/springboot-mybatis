package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.controller.vo.SysUserVO;
import java.util.List;

/**
 * @author: niuhaijun
 * @date: 2019-11-06 14:34
 * @version: 1.0
 * @description: 高级查询 1对多
 */
public interface HighLevelSearchOfOneToManyMapper {

  List<SysUserVO> selectAllUserAndRoleList();


  List<SysUserVO> selectAllUserAndRoleList1();

}
