package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.Good;
import com.niu.springbootmybatis.model.GoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodMapper {
    int countByExample(GoodExample example);

    int deleteByExample(GoodExample example);

    int deleteByPrimaryKey(String id);

    int insert(Good record);

    int insertSelective(Good record);

    List<Good> selectByExampleWithRowbounds(GoodExample example, RowBounds rowBounds);

    List<Good> selectByExample(GoodExample example);

    Good selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByExample(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);

    Long sumByExample(GoodExample example);

    void batchInsert(@Param("items") List<Good> items);
}