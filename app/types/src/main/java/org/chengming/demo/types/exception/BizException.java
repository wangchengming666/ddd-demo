package org.chengming.demo.types.exception;

import org.chengming.demo.types.enums.ResultCode;
import lombok.Getter;

@Getter
public class BizException extends RuntimeException {

    private String code;

    private Object data;

    public BizException(String code, String msg) {
        super(msg);
        this.code = code;
    }

    public BizException(String msg) {
        super(msg);
    }

    public BizException(ResultCode code) {
        super(code.getDesc());
        this.code = code.getCode();
    }

    public BizException(ResultCode code, String msg) {
        super(msg);
        this.code = code.getCode();
    }

    public BizException(String code, String msg, Object data) {
        super(msg);
        this.code = code;
        this.data = data;
    }
}
