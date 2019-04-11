package com.niu.springbootmybatis.controller.vo;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-11 17:59
 * @Version 1.0
 */
@Data
public class UserGoodVO extends UserVO {

  private String id;

  private String username;

  private Integer used;

  private List<GoodVO> goodVOList = new ArrayList<>();

}
