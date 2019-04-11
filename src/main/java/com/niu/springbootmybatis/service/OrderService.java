package com.niu.springbootmybatis.service;

import com.niu.springbootmybatis.controller.param.OrderPara;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 17:43
 * @Version 1.0
 */
public interface OrderService {

  Integer add(OrderPara orderPara);
}
