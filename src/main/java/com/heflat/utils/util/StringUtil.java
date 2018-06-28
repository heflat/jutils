package com.heflat.utils.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 *
 * @author heflat
 * @date 2018-6-28 09:51:53
 */
public class StringUtil extends StringUtils {

    private static final int MOBILE_PHONE_LENGTH = 11;

    /**
     * 隐藏手机号码中间四位数字
     * "*" 代替
     *
     * @param phoneNumber 11 位数字的手机号码
     * @return
     */
    public static String mobilePhone(String phoneNumber) {
        if (!isNumericSpace(phoneNumber)) {
            return EMPTY;
        }

        if (phoneNumber.length() == MOBILE_PHONE_LENGTH) {
            String regex = "^(\\d{3})\\d{4}(\\d{4})$";
            return phoneNumber.replaceAll(regex, "$1****$2");
        }

        return phoneNumber;
    }
}
