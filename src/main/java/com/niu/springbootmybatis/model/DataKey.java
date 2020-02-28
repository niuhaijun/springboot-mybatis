package com.niu.springbootmybatis.model;

import java.io.Serializable;
import java.util.Date;

public class DataKey implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date date;
	private String taskId;

	public DataKey(Date date, String taskId) {

		this.date = date;
		this.taskId = taskId;
	}

	public DataKey() {

		super();
	}

	public Date getDate() {

		return date;
	}

	public void setDate(Date date) {

		this.date = date;
	}

	public String getTaskId() {

		return taskId;
	}

	public void setTaskId(String taskId) {

		this.taskId = taskId == null ? null : taskId.trim();
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", date=").append(date);
		sb.append(", taskId=").append(taskId);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}