package org.kevin.model;

import org.kevin.common.CommonUtils;

import java.time.LocalDateTime;

/**
 * @author Kevin.Z
 * @version 2021/3/29
 */
public class BaseModel {
    protected String id;
    protected LocalDateTime createTime;

    public BaseModel() {
        this.id = CommonUtils.generateUUID();
        this.createTime = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
