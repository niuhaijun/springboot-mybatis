package com.niu.springbootmybatis.controller.vo;

import java.util.Date;
import lombok.Data;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 17:40
 * @Version 1.0
 */
@Data
public class OrderVO {

  private String userId;

  private String goodId;

  private Date createTime;

  private Date updateTime;

  private Integer used;

}
