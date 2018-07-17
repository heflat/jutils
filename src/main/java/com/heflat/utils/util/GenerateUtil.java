package com.heflat.utils.util;

import java.util.UUID;

/**
 * 生成工具类
 *
 * @author heflat
 * @date 2018-07-17 11:48
 */
public class GenerateUtil {

    private static final int RANDOM_NUMBER_LENGTH = 10;

    /**
     * UUID
     *
     * @return
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 六位数验证码
     *
     * @return
     */
    public static String verificationCode() {
        int number = (int) ((Math.random() * 9 + 1) * 100000);
        return String.valueOf(number);
    }

    /**
     * 指定长度随机数
     *
     * @param length 随机数长度，范围 1 ~ 10
     * @return
     */
    public static String randomNumber(int length) {
        if (length < 1 || length > RANDOM_NUMBER_LENGTH) {
            return null;
        }

        int number = (int) ((Math.random() * 9 + 1) * Math.pow(10, length - 1));
        return String.valueOf(number);
    }
}
