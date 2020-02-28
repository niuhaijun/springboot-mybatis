package com.niu.springbootmybatis.model;

import java.io.Serializable;

public class SysRolePrivilege implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long roleId;
	private Long privilegeId;
	private String updateSql;

	public SysRolePrivilege(Long roleId, Long privilegeId) {

		this.roleId = roleId;
		this.privilegeId = privilegeId;
	}

	public SysRolePrivilege() {

		super();
	}

	public Long getRoleId() {

		return roleId;
	}

	public void setRoleId(Long roleId) {

		this.roleId = roleId;
	}

	public Long getPrivilegeId() {

		return privilegeId;
	}

	public void setPrivilegeId(Long privilegeId) {

		this.privilegeId = privilegeId;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", roleId=").append(roleId);
		sb.append(", privilegeId=").append(privilegeId);
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