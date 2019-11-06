package com.niu.springbootmybatis.controller.vo;

import java.util.Date;
import lombok.Data;

/**
 * @author: niuhaijun
 * @date: 2019-11-06 11:13
 * @version: 1.0
 * @description: xxx
 */
@Data
public class SysRoleVO {

  private Long id;

  private String roleName;

  private Integer enabled;

  private Long createBy;

  private Date createTime;

}
