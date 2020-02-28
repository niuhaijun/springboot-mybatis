package com.niu.springbootmybatis.model;

import java.io.Serializable;

public class Country implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String countryname;
	private String countrycode;
	private String updateSql;

	public Country(Integer id, String countryname, String countrycode) {

		this.id = id;
		this.countryname = countryname;
		this.countrycode = countrycode;
	}

	public Country() {

		super();
	}

	public Integer getId() {

		return id;
	}

	public void setId(Integer id) {

		this.id = id;
	}

	public String getCountryname() {

		return countryname;
	}

	public void setCountryname(String countryname) {

		this.countryname = countryname == null ? null : countryname.trim();
	}

	public String getCountrycode() {

		return countrycode;
	}

	public void setCountrycode(String countrycode) {

		this.countrycode = countrycode == null ? null : countrycode.trim();
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", countryname=").append(countryname);
		sb.append(", countrycode=").append(countrycode);
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