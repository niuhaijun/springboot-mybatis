package com.niu.springbootmybatis.controller.vo;

import java.util.Date;
import lombok.Data;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 15:19
 * @Version 1.0
 */
@Data
public class GoodVO {

	private String id;

	private Integer type;

	private String name;

	private Double price;

	private Integer num;

	private Date createTime;

	private Date updateTime;

	private Integer used;
}
