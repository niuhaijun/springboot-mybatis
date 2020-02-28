package com.niu.springbootmybatis.service;

import com.niu.springbootmybatis.controller.param.DataParam;
import com.niu.springbootmybatis.controller.vo.DataVO;
import java.util.List;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 20:04
 * @Version 1.0
 */
public interface DataService {

	/**
	 * 根据查询条件获取查询结果
	 */
	List<DataVO> analysisData(DataParam dataParam);
}
