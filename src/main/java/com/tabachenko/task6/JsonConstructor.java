package com.tabachenko.task6;

import java.io.Serializable;

public class JsonConstructor implements Serializable {

    public String getOrgId(String bmcops) {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getName(String s) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLastUpdate(int i) {
        return lastUpdate;
    }

    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getUserGroupId(String idmService) {
        return userGroupId;
    }

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    public String getUserId(String idmServiceUser) {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDescription(String s) {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion(String s) {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getDocumentVersion(int i) {
        return documentVersion;
    }

    public void setDocumentVersion(int documentVersion) {
        this.documentVersion = documentVersion;
    }

    @Override
    public String toString() {
        return "JsonConstructor{" +
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



