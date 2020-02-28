package com.niu.springbootmybatis.controller.param;

import java.util.Date;
import lombok.Data;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 17:09
 * @Version 1.0
 */
@Data
public class GoodPara {

	private Integer pageNum = 1;

	private Integer pageSize = 2;

	private String id;

	private Integer type;

	private String name;

	private Double price;

	private Integer num;

	private Date createTime;

	private Date updateTime;

	private Integer used;
}
