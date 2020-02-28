package com.niu.springbootmybatis.model;

import java.io.Serializable;

public class RepalceDeadLock implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer fid;
	private String content;

	public RepalceDeadLock(Integer id, Integer fid, String content) {

		this.id = id;
		this.fid = fid;
		this.content = content;
	}

	public RepalceDeadLock() {

		super();
	}

	public Integer getId() {

		return id;
	}

	public void setId(Integer id) {

		this.id = id;
	}

	public Integer getFid() {

		return fid;
	}

	public void setFid(Integer fid) {

		this.fid = fid;
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
		sb.append(", fid=").append(fid);
		sb.append(", content=").append(content);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}