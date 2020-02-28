package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.SysPrivilege;
import com.niu.springbootmybatis.model.SysPrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysPrivilegeMapper {

	int countByExample(SysPrivilegeExample example);

	int deleteByExample(SysPrivilegeExample example);

	int deleteByPrimaryKey(Long id);

	int insert(SysPrivilege record);

	int insertSelective(SysPrivilege record);

	List<SysPrivilege> selectByExampleWithRowbounds(SysPrivilegeExample example,
		RowBounds rowBounds);

	List<SysPrivilege> selectByExample(SysPrivilegeExample example);

	SysPrivilege selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") SysPrivilege record,
		@Param("example") SysPrivilegeExample example);

	int updateByExample(@Param("record") SysPrivilege record,
		@Param("example") SysPrivilegeExample example);

	int updateByPrimaryKeySelective(SysPrivilege record);

	int updateByPrimaryKey(SysPrivilege record);

	Long sumByExample(SysPrivilegeExample example);

	void batchInsert(@Param("items") List<SysPrivilege> items);
}