package com.heflat.jutils.enums;

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

    READ_PROPERTIES_FILE_ERROR(20, "读取配置文件错误"),
    ;

    private Integer code;

    private String message;
    ;
}
