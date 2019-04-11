package com.niu.springbootmybatis.service.impl;

import com.niu.springbootmybatis.controller.param.OrderPara;
import com.niu.springbootmybatis.mapper.OrderMapper;
import com.niu.springbootmybatis.model.Good;
import com.niu.springbootmybatis.model.Order;
import com.niu.springbootmybatis.service.OrderService;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 17:43
 * @Version 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

  @Autowired
  private OrderMapper orderMapper;

  @Override
  public Integer add(OrderPara orderPara) {

    Date date = new Date();
    orderPara.setCreateTime(date);
    orderPara.setUpdateTime(date);

    Order order = new Order();
    BeanUtils.copyProperties(orderPara, order);
    return orderMapper.insertSelective(order);
  }
}
