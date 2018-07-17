package com.heflat.jutils.util;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * 数组工具类
 *
 * @author heflat
 * @date 2018-6-28 10:03:53
 */
public class ArrayUtil {

    /**
     * 字符串转数组
     * 通过分隔符将字符串转换成数组
     *
     * @param str 字符串
     * @param separatorChars 分隔符
     * @return
     */
    public static String[] strToArray(String str, String separatorChars) {
        return StringUtils.split(str, separatorChars);
    }

    /**
     * 获取 Integer[] 中的最大值
     *
     * @param array Integer[]
     * @return
     */
    public static Integer getMaxValue(Integer[] array) {
        Integer maxValue = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            maxValue = maxValue < array[i + 1] ? array[i + 1] : maxValue;
        }

        return maxValue;
    }

    /**
     * 获取 Integer[] 中的最小值
     *
     * @param array Integer[]
     * @return
     */
    public static Integer getMinValue(Integer[] array) {
        Integer minValue = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            minValue = minValue > array[i + 1] ? array[i + 1] : minValue;
        }

        return minValue;
    }

    /**
     * Integer[] 去重复
     *
     * @param array Integer[]
     * @return
     */
    public static Integer[] deduplication(Integer[] array) {

        List<Integer> list = Lists.newLinkedList();
        for (int i = 0; i < array.length; i++) {
            if (!list.contains(array[i])) {
                list.add(array[i]);
            }
        }

        return list.toArray(new Integer[0]);
    }

    public static void main(String[] args) {

    }
}
