package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.controller.param.DataParam;
import com.niu.springbootmybatis.controller.vo.DataVO;
import com.niu.springbootmybatis.model.Data;
import com.niu.springbootmybatis.model.DataExample;
import com.niu.springbootmybatis.model.DataKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DataMapper {
    int countByExample(DataExample example);

    int deleteByExample(DataExample example);

    int deleteByPrimaryKey(DataKey key);

    int insert(Data record);

    int insertSelective(Data record);

    List<Data> selectByExampleWithRowbounds(DataExample example, RowBounds rowBounds);

    List<Data> selectByExample(DataExample example);

    Data selectByPrimaryKey(DataKey key);

    int updateByExampleSelective(@Param("record") Data record, @Param("example") DataExample example);

    int updateByExample(@Param("record") Data record, @Param("example") DataExample example);

    int updateByPrimaryKeySelective(Data record);

    int updateByPrimaryKey(Data record);

    List<DataVO> analysisData(DataParam param);
}