package com.niu.springbootmybatis.controller.param;

import java.util.Date;
import lombok.Data;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 15:18
 * @Version 1.0
 */
@Data
public class UserPara {

  private Integer pageNum = 1;

  private Integer pageSize = 2;

  private String id;

  private String username;

  private String password;

  private Date createTime;

  private Date updateTime;

  private Integer used;

}
