package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.AutoId;
import com.niu.springbootmybatis.model.AutoIdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AutoIdMapper {
    int countByExample(AutoIdExample example);

    int deleteByExample(AutoIdExample example);

    int deleteByPrimaryKey(Integer autoId);

    List<AutoId> selectByExampleWithRowbounds(AutoIdExample example, RowBounds rowBounds);

    List<AutoId> selectByExample(AutoIdExample example);

    AutoId selectByPrimaryKey(Integer autoId);

    int updateByExampleSelective(@Param("record") AutoId record, @Param("example") AutoIdExample example);

    int updateByExample(@Param("record") AutoId record, @Param("example") AutoIdExample example);

    int updateByPrimaryKeySelective(AutoId record);

    int updateByPrimaryKey(AutoId record);

    Long sumByExample(AutoIdExample example);

    void batchInsert(@Param("items") List<AutoId> items);

    int insert(AutoId record);

    int insertSelective(AutoId record);




    int insertAndGetAutoIncId(AutoId record);
    int insertAndGetAutoIncrementId(AutoId record);
}