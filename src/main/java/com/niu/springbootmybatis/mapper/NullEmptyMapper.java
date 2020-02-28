package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.NullEmpty;
import com.niu.springbootmybatis.model.NullEmptyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NullEmptyMapper {

	int countByExample(NullEmptyExample example);

	int deleteByExample(NullEmptyExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(NullEmpty record);

	int insertSelective(NullEmpty record);

	List<NullEmpty> selectByExampleWithRowbounds(NullEmptyExample example, RowBounds rowBounds);

	List<NullEmpty> selectByExample(NullEmptyExample example);

	NullEmpty selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") NullEmpty record,
		@Param("example") NullEmptyExample example);

	int updateByExample(@Param("record") NullEmpty record,
		@Param("example") NullEmptyExample example);

	int updateByPrimaryKeySelective(NullEmpty record);

	int updateByPrimaryKey(NullEmpty record);


	/**
	 * 插入常量 null
	 */
	int insertNull();

	/**
	 * 插入常量 ""
	 * @return
	 */
	int insertEmpty();

	/**
	 * 更新为 null
	 */
	int updateNull(int id);

	/**
	 * 更新为 ""
	 */
	int updateEmpty(int id);
}