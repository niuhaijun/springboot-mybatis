package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.MBG;
import com.niu.springbootmybatis.model.MBGExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MBGMapper {
    int countByExample(MBGExample example);

    int deleteByExample(MBGExample example);

    int deleteByPrimaryKey(String uid);

    int insert(MBG record);

    int insertSelective(MBG record);

    List<MBG> selectByExampleWithRowbounds(MBGExample example, RowBounds rowBounds);

    List<MBG> selectByExample(MBGExample example);

    MBG selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") MBG record, @Param("example") MBGExample example);

    int updateByExample(@Param("record") MBG record, @Param("example") MBGExample example);

    int updateByPrimaryKeySelective(MBG record);

    int updateByPrimaryKey(MBG record);

    Long sumByExample(MBGExample example);

    void batchInsert(@Param("items") List<MBG> items);
}