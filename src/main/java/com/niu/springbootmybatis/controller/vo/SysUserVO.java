package com.niu.springbootmybatis.controller.vo;

import com.niu.springbootmybatis.model.SysRole;
import java.util.Date;
import lombok.Data;

/**
 * @author: niuhaijun
 * @date: 2019-11-06 10:51
 * @version: 1.0
 * @description: xxx
 */
@Data
public class SysUserVO {

  // 用户信息
  private Long id;
  private String userName;
  private String userPassword;
  private String userEmail;
  private Date createTime;
  private String userInfo;
  private byte[] headImg;

  // 用户的角色信息
  private SysRoleVO roleVO;
}
