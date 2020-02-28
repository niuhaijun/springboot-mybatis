package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.Task;
import com.niu.springbootmybatis.model.TypeHandlerEnum;
import com.niu.springbootmybatis.model.TypeHandlerEnumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TypeHandlerEnumMapper {

	int countByExample(TypeHandlerEnumExample example);

	int deleteByExample(TypeHandlerEnumExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(TypeHandlerEnum record);

	int insertSelective(TypeHandlerEnum record);

	List<TypeHandlerEnum> selectByExampleWithRowbounds(TypeHandlerEnumExample example,
		RowBounds rowBounds);

	List<TypeHandlerEnum> selectByExample(TypeHandlerEnumExample example);

	TypeHandlerEnum selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") TypeHandlerEnum record,
		@Param("example") TypeHandlerEnumExample example);

	int updateByExample(@Param("record") TypeHandlerEnum record,
		@Param("example") TypeHandlerEnumExample example);

	int updateByPrimaryKeySelective(TypeHandlerEnum record);

	int updateByPrimaryKey(TypeHandlerEnum record);

	Long sumByExample(TypeHandlerEnumExample example);

	void batchInsert(@Param("items") List<TypeHandlerEnum> items);


	void save(Task task);

	List<Task> queryAll();
}