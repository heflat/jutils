package com.heflat.utils.util;

import com.heflat.utils.enums.CodeEnum;
import com.heflat.utils.exception.UtilException;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * 生成工具类
 *
 * @author heflat
 * @date 2018-7-17 14:10
 */
@Slf4j
public class GenerateUtil {

    private static final int RANDOM_NUMBER_LENGTH = 10;

    /**
     * 生成 UUID
     *
     * @return
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 生成六位数验证码
     *
     * @return
     */
    public static String verificationCode() {
        int number = (int) ((Math.random() * 9 + 1) * 100000);
        return String.valueOf(number);
    }

    /**
     * 生成 1 ~ 10 位长度随机数
     *
     * @param length 随机数长度，范围 1 ~ 10
     * @return
     */
    public static String randomNumber(int length) {
        if (length < 1 || length > RANDOM_NUMBER_LENGTH) {
            log.error("【randomNumber】参数错误，length={}，参数范围应为 1 ~ 10", length);
            throw new UtilException(CodeEnum.PARAM_ERROR);
        }

        int number = (int) ((Math.random() * 9 + 1) * Math.pow(10, length - 1));
        return String.valueOf(number);
    }
}
