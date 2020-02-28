package com.niu.springbootmybatis.model;

import java.io.Serializable;
import java.util.Date;

public class Equality implements Serializable {

	private static final long serialVersionUID = 1L;
	private String uuid;
	private Integer type;
	private String name;
	private Date createTime;

	public Equality(String uuid, Integer type, String name, Date createTime) {

		this.uuid = uuid;
		this.type = type;
		this.name = name;
		this.createTime = createTime;
	}

	public Equality() {

		super();
	}

	public String getUuid() {

		return uuid;
	}

	public void setUuid(String uuid) {

		this.uuid = uuid == null ? null : uuid.trim();
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

	public Date getCreateTime() {

		return createTime;
	}

	public void setCreateTime(Date createTime) {

		this.createTime = createTime;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", uuid=").append(uuid);
		sb.append(", type=").append(type);
		sb.append(", name=").append(name);
		sb.append(", createTime=").append(createTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}