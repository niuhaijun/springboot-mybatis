package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.model.Goods;
import com.niu.springbootmybatis.model.GoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsMapper {
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(String id);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExampleWithRowbounds(GoodsExample example, RowBounds rowBounds);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    Long sumByExample(GoodsExample example);

    void batchInsert(@Param("items") List<Goods> items);
}