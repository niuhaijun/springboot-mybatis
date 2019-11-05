package com.niu.springbootmybatis.model;

import java.io.Serializable;

public class MBG implements Serializable {
    private String uid;

    private String uuid;

    private String kid;

    private static final long serialVersionUID = 1L;

    private String updateSql;

    public MBG(String uid, String uuid, String kid) {
        this.uid = uid;
        this.uuid = uuid;
        this.kid = kid;
    }

    public MBG() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getKid() {
        return kid;
    }

    public void setKid(String kid) {
        this.kid = kid == null ? null : kid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", uuid=").append(uuid);
        sb.append(", kid=").append(kid);
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