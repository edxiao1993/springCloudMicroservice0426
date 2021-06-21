package org.kevin.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Finance {
    private String id;

    private BigDecimal cost;

    private String forWhat;

    private String type;

    private LocalDateTime createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getForWhat() {
        return forWhat;
    }

    public void setForWhat(String forWhat) {
        this.forWhat = forWhat == null ? null : forWhat.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}