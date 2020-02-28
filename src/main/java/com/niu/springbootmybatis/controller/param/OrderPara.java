package com.niu.springbootmybatis.controller.param;

import java.util.Date;
import lombok.Data;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 17:41
 * @Version 1.0
 */
@Data
public class OrderPara {

	private String userId;

	private String goodId;

	private Date createTime;

	private Date updateTime;

	private Integer used;

}
