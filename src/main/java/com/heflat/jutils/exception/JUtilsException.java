package com.heflat.jutils.exception;

import com.heflat.jutils.enums.CodeEnum;
import lombok.Getter;

/**
 * 自定义异常
 *
 * @author heflat
 * @date 2018-07-17 14:03
 */
@Getter
public class JUtilsException extends RuntimeException {

    private Integer code;

    public JUtilsException(CodeEnum codeEnum) {
        super(codeEnum.getMessage());
        this.code = codeEnum.getCode();
    }

    public JUtilsException(String message, Integer code) {
        super(message);
        this.code = code;
    }
}
