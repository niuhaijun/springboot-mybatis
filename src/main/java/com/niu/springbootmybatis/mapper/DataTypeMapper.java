package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.DataType;
import com.niu.springbootmybatis.model.DataTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DataTypeMapper {
    int countByExample(DataTypeExample example);

    int deleteByExample(DataTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataType record);

    int insertSelective(DataType record);

    List<DataType> selectByExampleWithBLOBsWithRowbounds(DataTypeExample example, RowBounds rowBounds);

    List<DataType> selectByExampleWithBLOBs(DataTypeExample example);

    List<DataType> selectByExampleWithRowbounds(DataTypeExample example, RowBounds rowBounds);

    List<DataType> selectByExample(DataTypeExample example);

    DataType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataType record, @Param("example") DataTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") DataType record, @Param("example") DataTypeExample example);

    int updateByExample(@Param("record") DataType record, @Param("example") DataTypeExample example);

    int updateByPrimaryKeySelective(DataType record);

    int updateByPrimaryKeyWithBLOBs(DataType record);

    Long sumByExample(DataTypeExample example);

    void batchInsert(@Param("items") List<DataType> items);
}