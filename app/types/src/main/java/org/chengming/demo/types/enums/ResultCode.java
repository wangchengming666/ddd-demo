/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package org.chengming.demo.types.enums;

import lombok.Getter;

@Getter
public enum ResultCode {

    /**
     * 成功
     */
    SUCCESS("SUCCESS", "SUCCESS", "成功"),

    /**
     * 未知异常
     */
    SYSTEM_ERROR("SYSTEM_ERROR", "SYSTEM_ERROR", "系统繁忙，请稍后再试"),

    ;
    private String code;

    /**
     * 内部结果码
     */
    private String innerResultCode;

    private String desc;

    ResultCode(String outResultCode, String innerResultCode, String desc) {
        this.code = outResultCode;
        this.innerResultCode = innerResultCode;
        this.desc = desc;
    }
}