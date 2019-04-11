package com.niu.springbootmybatis.controller.vo;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @Author: niuhaijun
 * @Date: 2019-04-08 18:09
 * @Version 1.0
 */
@JsonInclude(NON_NULL)
@Data
public class DataVO {

  private String days;

  private String weeks;

  private String months;

  private Long totals;
}
