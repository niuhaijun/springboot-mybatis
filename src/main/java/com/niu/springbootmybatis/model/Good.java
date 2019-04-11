package com.niu.springbootmybatis.model;

import java.io.Serializable;
import java.util.Date;

public class Good implements Serializable {

  private static final long serialVersionUID = 1L;
  private String id;
  private Integer type;
  private String name;
  private Double price;
  private Integer num;
  private Date createTime;
  private Date updateTime;
  private Integer used;

  public Good(String id, Integer type, String name, Double price, Integer num, Date createTime,
      Date updateTime, Integer used) {

    this.id = id;
    this.type = type;
    this.name = name;
    this.price = price;
    this.num = num;
    this.createTime = createTime;
    this.updateTime = updateTime;
    this.used = used;
  }

  public Good() {

    super();
  }

  public String getId() {

    return id;
  }

  public void setId(String id) {

    this.id = id == null ? null : id.trim();
  }

  public Integer getType() {

    return type;
  }

  public void setType(Integer type) {

    this.type = type;
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {

    this.name = name == null ? null : name.trim();
  }

  public Double getPrice() {

    return price;
  }

  public void setPrice(Double price) {

    this.price = price;
  }

  public Integer getNum() {

    return num;
  }

  public void setNum(Integer num) {

    this.num = num;
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
    sb.append(", id=").append(id);
    sb.append(", type=").append(type);
    sb.append(", name=").append(name);
    sb.append(", price=").append(price);
    sb.append(", num=").append(num);
    sb.append(", createTime=").append(createTime);
    sb.append(", updateTime=").append(updateTime);
    sb.append(", used=").append(used);
    sb.append(", serialVersionUID=").append(serialVersionUID);
    sb.append("]");
    return sb.toString();
  }
}