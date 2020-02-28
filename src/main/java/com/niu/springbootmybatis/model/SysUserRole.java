package com.niu.springbootmybatis.model;

import java.io.Serializable;

public class SysUserRole implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long userId;
	private Long roleId;
	private String updateSql;

	public SysUserRole(Long userId, Long roleId) {

		this.userId = userId;
		this.roleId = roleId;
	}

	public SysUserRole() {

		super();
	}

	public Long getUserId() {

		return userId;
	}

	public void setUserId(Long userId) {

		this.userId = userId;
	}

	public Long getRoleId() {

		return roleId;
	}

	public void setRoleId(Long roleId) {

		this.roleId = roleId;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", userId=").append(userId);
		sb.append(", roleId=").append(roleId);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	public String getUpdateSql() {

		return this.updateSql;
	}

	public void setUpdateSql(String updateSql) {

		this.updateSql = updateSql;
	}
}