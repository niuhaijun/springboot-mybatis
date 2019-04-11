package com.niu.springbootmybatis.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class User implements Serializable {

  private static final long serialVersionUID = -469249581615519373L;

  private Integer id;

  private String userName;

  private String password;
}