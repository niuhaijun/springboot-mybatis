package com.niu.springbootmybatis.model;

import com.niu.springbootmybatis.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: niuhaijun
 * @Date: 2019-08-20 14:59
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

  private Integer id;
  private Status status;

}
