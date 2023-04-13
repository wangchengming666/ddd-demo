/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package org.chengming.demo.facade.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class RpcResult<T> implements Serializable {

    private static final long serialVersionUID = -8337242569204523061L;

    /**
     * 结果码
     */
    private String resultCode;

    /**
     * 结果描述
     */
    private String resultMsg;

    /**
     * 返回结果
     */
    private T result;

    /**
     * 是否成功
     */
    private boolean success = false;

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "AipResponseResult [resultCode=" + resultCode + ", resultMsg=" + resultMsg + ", result="
                + result + ", isSuccess=" + success + "]";
    }

    /**
     * 标准构造函数
     */
    public RpcResult() {

    }

    /**
     * 构造失败的结果
     *
     * @param resultMsg
     * @return
     */
    public static <T> RpcResult<T> fail(String resultMsg) {
        return fail("", resultMsg);
    }

    public static <T> RpcResult<T> fail(String code, String resultMsg) {
        RpcResult<T> ret = new RpcResult<>();
        ret.setSuccess(false);
        ret.setResultMsg(resultMsg);
        ret.setResultCode(code);
        return ret;
    }

    /**
     * 构造成功结果
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> RpcResult<T> success(T data, String resultMsg) {
        RpcResult<T> ret = new RpcResult<>();
        ret.setSuccess(true);
        ret.setResult(data);
        ret.setResultMsg(resultMsg);
        return ret;
    }

    /**
     * 构造成功结果
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> RpcResult<T> success(T data) {
        return success(data, "SUCCESS");
    }

}