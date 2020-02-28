package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.SysUserRole;
import com.niu.springbootmybatis.model.SysUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysUserRoleMapper {

	int countByExample(SysUserRoleExample example);

	int deleteByExample(SysUserRoleExample example);

	int insert(SysUserRole record);

	int insertSelective(SysUserRole record);

	List<SysUserRole> selectByExampleWithRowbounds(SysUserRoleExample example, RowBounds rowBounds);

	List<SysUserRole> selectByExample(SysUserRoleExample example);

	int updateByExampleSelective(@Param("record") SysUserRole record,
		@Param("example") SysUserRoleExample example);

	int updateByExample(@Param("record") SysUserRole record,
		@Param("example") SysUserRoleExample example);

	Long sumByExample(SysUserRoleExample example);

	void batchInsert(@Param("items") List<SysUserRole> items);
}