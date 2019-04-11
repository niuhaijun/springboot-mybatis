package com.niu.springbootmybatis.model;

import java.io.Serializable;
import java.util.Date;

public class Order extends OrderKey implements Serializable {

  private static final long serialVersionUID = 1L;
  private Date createTime;
  private Date updateTime;
  private Integer used;

  public Order(String userId, String goodId, Date createTime, Date updateTime, Integer used) {

    super(userId, goodId);
    this.createTime = createTime;
    this.updateTime = updateTime;
    this.used = used;
  }

  public Order() {

    super();
  }

  public Date getCreateTime() {

    return createTime;
  }

  public void setCreateTime(Date createTime) {

    this.createTime = createTime;
  }

  public Date getUpdateTime() {

    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {

    this.updateTime = updateTime;
  }

  public Integer getUsed() {

    return used;
  }

  public void setUsed(Integer used) {

    this.used = used;
  }

  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" [");
    sb.append("Hash = ").append(hashCode());
    sb.append(", createTime=").append(createTime);
    sb.append(", updateTime=").append(updateTime);
    sb.append(", used=").append(used);
    sb.append(", serialVersionUID=").append(serialVersionUID);
    sb.append("]");
    return sb.toString();
  }
}