package com.niu.springbootmybatis.model;

import java.io.Serializable;
import java.util.Date;

public class Data extends DataKey implements Serializable {
    private String taskType;

    private Long num;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Data(Date date, String taskId, String taskType, Long num, Date createTime) {
        super(date, taskId);
        this.taskType = taskType;
        this.num = num;
        this.createTime = createTime;
    }

    public Data() {
        super();
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
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
        sb.append(", taskType=").append(taskType);
        sb.append(", num=").append(num);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}