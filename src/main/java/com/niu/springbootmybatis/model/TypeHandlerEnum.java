package com.niu.springbootmybatis.model;

import java.io.Serializable;

public class TypeHandlerEnum implements Serializable {
    private Integer id;

    private Integer status;

    private static final long serialVersionUID = 1L;

    private String updateSql;

    public TypeHandlerEnum(Integer id, Integer status) {
        this.id = id;
        this.status = status;
    }

    public TypeHandlerEnum() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", status=").append(status);
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