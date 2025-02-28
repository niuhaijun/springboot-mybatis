package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.SysDict;
import com.niu.springbootmybatis.model.SysDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysDictMapper {

	int countByExample(SysDictExample example);

	int deleteByExample(SysDictExample example);

	int deleteByPrimaryKey(Long id);

	int insert(SysDict record);

	int insertSelective(SysDict record);

	List<SysDict> selectByExampleWithRowbounds(SysDictExample example, RowBounds rowBounds);

	List<SysDict> selectByExample(SysDictExample example);

	SysDict selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") SysDict record,
		@Param("example") SysDictExample example);

	int updateByExample(@Param("record") SysDict record, @Param("example") SysDictExample example);

	int updateByPrimaryKeySelective(SysDict record);

	int updateByPrimaryKey(SysDict record);

	Long sumByExample(SysDictExample example);

	void batchInsert(@Param("items") List<SysDict> items);
}