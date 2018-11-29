package com.happycommunity.framework.common.model.result;

import com.happycommunity.framework.common.model.enums.ResultStatusEnumInterface;

import java.io.Serializable;

/**
 * @author Danny
 * @Title: BaseResult
 * @Description:
 * @Created on 2018-11-29 12:56:31
 */
public class BaseResult implements Serializable {

    private static final long serialVersionUID = 7567039181931362380L;

    private ResultStatusEnumInterface resultStatusEnum;

    public BaseResult() {
    }

    public BaseResult(ResultStatusEnumInterface resultStatusEnum) {
        this.resultStatusEnum = resultStatusEnum;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public ResultStatusEnumInterface getResultStatusEnum() {
        return resultStatusEnum;
    }

    public BaseResult setResultStatusEnum(ResultStatusEnumInterface resultStatusEnum) {
        this.resultStatusEnum = resultStatusEnum;
        return this;
    }
}
