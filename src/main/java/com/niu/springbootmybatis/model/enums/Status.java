package com.niu.springbootmybatis.model.enums;

/**
 * @Author: niuhaijun
 * @Date: 2019-08-20 14:57
 * @Version 1.0
 */
public enum Status {

  LOGIN(100, "在线"),
  LOGOUT(200, "不在线");

  private Integer code;
  private String msg;

  Status(Integer code, String msg) {

    this.code = code;
    this.msg = msg;
  }

  /**
   * 通过 code 获取 Status
   * @param code
   * @return
   */
  public static Status getStatusByCode(Integer code) {

    switch (code) {
      case 100:
        return LOGIN;
      case 200:
        return LOGOUT;
      default:
        return LOGOUT;
    }
  }

  public Integer getCode() {

    return code;
  }

  public String getMsg() {

    return msg;
  }
}
