package com.niu.springbootmybatis.controller;

import com.github.pagehelper.PageInfo;
import com.niu.springbootmybatis.controller.param.GoodPara;
import com.niu.springbootmybatis.controller.vo.GoodVO;
import com.niu.springbootmybatis.service.GoodService;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 15:26
 * @Version 1.0
 */
@RestController
@RequestMapping("/good")
public class GoodController {

	@Autowired
	private GoodService goodService;

	@RequestMapping("/add")
	public Integer add(GoodPara goodPara) {

		goodPara.setId(UUID.randomUUID().toString().replaceAll("-", "").toLowerCase());
		return goodService.add(goodPara);
	}

	@RequestMapping("/update")
	public Integer update(GoodPara goodPara) {

		return goodService.update(goodPara);
	}

	@RequestMapping("/logicDelete")
	public Integer logicDelete(GoodPara goodPara) {

		return goodService.logicDelete(goodPara);
	}

	@RequestMapping("/delete")
	public Integer delete(GoodPara goodPara) {

		return goodService.delete(goodPara);
	}

	@RequestMapping("/select")
	public List<GoodVO> select(GoodPara goodPara) {

		return goodService.select(goodPara);
	}

	@RequestMapping("/pagedSelect")
	public PageInfo<GoodVO> pagedSelect(GoodPara goodPara) {

		return goodService.pagedSelect(goodPara);
	}

}
