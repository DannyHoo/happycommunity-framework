package com.happycommunity.framework.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Danny
 * @Title: BaseDO
 * @Description:
 * @Created on 2018-11-27 12:03:23
 */
public class BaseDO implements Serializable {

    private static final long serialVersionUID = 3077588853434604698L;

    private long id;

    private Date createTime;

    private Date updateTime;

    private String comment;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public BaseDO setId(long id) {
        this.id = id;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public BaseDO setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public BaseDO setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public BaseDO setComment(String comment) {
        this.comment = comment;
        return this;
    }
}

