package com.niu.springbootmybatis.model;

import java.io.Serializable;

public class NullEmpty implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String content;

	public NullEmpty(Integer id, String content) {

		this.id = id;
		this.content = content;
	}

	public NullEmpty() {

		super();
	}

	public Integer getId() {

		return id;
	}

	public void setId(Integer id) {

		this.id = id;
	}

	public String getContent() {

		return content;
	}

	public void setContent(String content) {

		this.content = content == null ? null : content.trim();
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", content=").append(content);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}