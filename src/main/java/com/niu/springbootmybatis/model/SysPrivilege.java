package com.niu.springbootmybatis.model;

import java.io.Serializable;

public class SysPrivilege implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String privilegeName;
	private String privilegeUrl;
	private String updateSql;

	public SysPrivilege(Long id, String privilegeName, String privilegeUrl) {

		this.id = id;
		this.privilegeName = privilegeName;
		this.privilegeUrl = privilegeUrl;
	}

	public SysPrivilege() {

		super();
	}

	public Long getId() {

		return id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public String getPrivilegeName() {

		return privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {

		this.privilegeName = privilegeName == null ? null : privilegeName.trim();
	}

	public String getPrivilegeUrl() {

		return privilegeUrl;
	}

	public void setPrivilegeUrl(String privilegeUrl) {

		this.privilegeUrl = privilegeUrl == null ? null : privilegeUrl.trim();
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", privilegeName=").append(privilegeName);
		sb.append(", privilegeUrl=").append(privilegeUrl);
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