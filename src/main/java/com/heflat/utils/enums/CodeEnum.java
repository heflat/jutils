package com.heflat.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * 
 * @author heflat
 * @date 2018-07-17 14:06
 */
@Getter
@AllArgsConstructor
public enum CodeEnum {

    PARAM_ERROR(10, "参数错误"),
    ;

    private Integer code;

    private String message;
    ;
}
