package com.tabachenko.task7;

import java.io.Serializable;

public class InfoTask implements Serializable {
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getDocumentVersion() {
        return documentVersion;
    }

    public void setDocumentVersion(int documentVersion) {
        this.documentVersion = documentVersion;
    }

    public InfoTask(String orgId, String name, long lastUpdate, String userGroupId, String userId, String description, String version, int documentVersion) {
        this.orgId = orgId;
        this.name = name;
        this.lastUpdate = lastUpdate;
        this.userGroupId = userGroupId;
        this.userId = userId;
        this.description = description;
        this.version = version;
        this.documentVersion = documentVersion;
    }

    @Override
    public String toString() {
        return "{" +
                "orgId='" + orgId + '\'' +
                ", name='" + name + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", userGroupId='" + userGroupId + '\'' +
                ", userId='" + userId + '\'' +
                ", description='" + description + '\'' +
                ", version='" + version + '\'' +
                ", documentVersion=" + documentVersion +
                '}';
    }

    private String orgId;
    private String name;
    private long lastUpdate;
    private String userGroupId;
    private String userId;
    private String description;
    private String version;
    private int documentVersion;





}
