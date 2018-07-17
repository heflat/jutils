package com.heflat.utils.exception;

import com.heflat.utils.enums.CodeEnum;
import lombok.Getter;

/**
 * 自定义异常
 *
 * @author heflat
 * @date 2018-07-17 14:03
 */
@Getter
public class UtilException extends RuntimeException {

    private Integer code;

    public UtilException(CodeEnum codeEnum) {
        super(codeEnum.getMessage());
        this.code = codeEnum.getCode();
    }

    public UtilException(String message, Integer code) {
        super(message);
        this.code = code;
    }
}
