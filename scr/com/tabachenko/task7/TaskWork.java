package com.tabachenko.task7;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.io.Serializable;
import java.security.KeyException;
import java.security.PublicKey;
import java.util.List;

public class TaskWork implements Serializable {
    private String orgId;
    private String name;
    private long lastUpdate;
    private String userGroupId;
    private String userId;
    private String description;
    private String version;
    private int documentVersion;
    private List<KV> tags;
    private String _id;


    public TaskWork(String orgId, String name, long lastUpdate, String userGroupId, String userId, String description, String version, int documentVersion, List<KV> tags, String _id) {
        this.orgId = orgId;
        this.name = name;
        this.lastUpdate = lastUpdate;
        this.userGroupId = userGroupId;
        this.userId = userId;
        this.description = description;
        this.version = version;
        this.documentVersion = documentVersion;
        this.tags = tags;
        this._id = _id;
    }

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

    public List<KV> getTags() {
        return tags;
    }

    public void setTags(List<KV> tags) {
        this.tags = tags;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
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
                ", tags=" + tags +
                ", _id='" + _id + '\'' +
                '}';
    }

    public class KV {

        private String key;
        private String value;

        public KV(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        @Override
        public String toString() {
            return "KV{" +
                    "key='" + key + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }


}
