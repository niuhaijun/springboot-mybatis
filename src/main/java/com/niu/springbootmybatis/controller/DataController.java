package com.niu.springbootmybatis.controller;

import com.niu.springbootmybatis.controller.param.DataParam;
import com.niu.springbootmybatis.controller.vo.DataVO;
import com.niu.springbootmybatis.service.DataService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-08 17:43
 * @Version 1.0
 */
@RestController
@RequestMapping("/data")
public class DataController {

	@Autowired
	private DataService dataService;

	@PostMapping(value = "/analysisData")
	public List<DataVO> analysisData(@Valid @RequestBody DataParam dataParam) {

		return dataService.analysisData(dataParam);
	}

}
