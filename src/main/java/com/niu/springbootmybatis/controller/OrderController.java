package com.niu.springbootmybatis.controller;

import com.niu.springbootmybatis.controller.param.OrderPara;
import com.niu.springbootmybatis.controller.vo.UserGoodVO;
import com.niu.springbootmybatis.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 17:42
 * @Version 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping("/add")
	public Integer add(OrderPara orderPara) {

		return orderService.add(orderPara);
	}

	@RequestMapping("/getUserWithGoods")
	public List<UserGoodVO> getUserWithGoods(String userId) {

		return orderService.getUserWithGoods(userId);
	}
}
