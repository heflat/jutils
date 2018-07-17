package com.heflat.utils.util;

import java.math.BigDecimal;

/**
 * BigDecimal 工具类
 *
 * @author heflat
 * @date 2018-07-17 14:51
 */
public class BigDecimalUtil {

    /**
     * 加
     *
     * @param b1
     * @param b2
     * @return
     */
    public static BigDecimal add(BigDecimal b1, BigDecimal b2) {
        return b1.add(b2);
    }

    /**
     * 减
     *
     * @param b1
     * @param b2
     * @return
     */
    public static BigDecimal sub(BigDecimal b1, BigDecimal b2) {
        return b1.subtract(b2);
    }

    /**
     * 乘
     *
     * @param b1
     * @param b2
     * @return
     */
    public static BigDecimal mul(BigDecimal b1, BigDecimal b2) {
        return b1.multiply(b2);
    }

    /**
     * 除
     * 结果四舍五入，保留两位小数
     *
     * @param b1
     * @param b2
     * @return
     */
    public static BigDecimal div(BigDecimal b1, BigDecimal b2) {
        return b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);
    }
}
