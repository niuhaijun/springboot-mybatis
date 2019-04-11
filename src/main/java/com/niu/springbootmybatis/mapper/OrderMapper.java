package com.niu.springbootmybatis.mapper;

import com.niu.springbootmybatis.controller.vo.UserGoodVO;
import com.niu.springbootmybatis.model.Order;
import com.niu.springbootmybatis.model.OrderExample;
import com.niu.springbootmybatis.model.OrderKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {

  int countByExample(OrderExample example);

  int deleteByExample(OrderExample example);

  int deleteByPrimaryKey(OrderKey key);

  int insert(Order record);

  int insertSelective(Order record);

  List<Order> selectByExample(OrderExample example);

  Order selectByPrimaryKey(OrderKey key);

  int updateByExampleSelective(@Param("record") Order record,
      @Param("example") OrderExample example);

  int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

  int updateByPrimaryKeySelective(Order record);

  int updateByPrimaryKey(Order record);

  /**
   * 联表查询
   */
  List<UserGoodVO> getUserWithGoods(String userId);

}