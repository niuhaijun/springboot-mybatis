package com.niu.springbootmybatis.model;

import java.io.Serializable;

public class OrderKey implements Serializable {

  private static final long serialVersionUID = 1L;
  private String userId;
  private String goodId;

  public OrderKey(String userId, String goodId) {

    this.userId = userId;
    this.goodId = goodId;
  }

  public OrderKey() {

    super();
  }

  public String getUserId() {

    return userId;
  }

  public void setUserId(String userId) {

    this.userId = userId == null ? null : userId.trim();
  }

  public String getGoodId() {

    return goodId;
  }

  public void setGoodId(String goodId) {

    this.goodId = goodId == null ? null : goodId.trim();
  }

  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", userId=").append(userId);
    sb.append(", goodId=").append(goodId);
    sb.append(", serialVersionUID=").append(serialVersionUID);
    sb.append("]");
    return sb.toString();
  }
}