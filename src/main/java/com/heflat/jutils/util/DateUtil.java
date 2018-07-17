package com.heflat.jutils.util;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * 日期工具类
 *
 * @author heflat
 * @date 2018-07-17 10:47
 */
public class DateUtil {

    public static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 字符串转 Date
     * date、format 格式需要保持一致
     *
     * @param date 字符串日期时间（例: 2018-07-17）
     * @param format 格式（例: yyyy-MM-dd）
     * @return
     */
    public static Date strToDate(String date, String format) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(format);
        DateTime dateTime = dateTimeFormatter.parseDateTime(date);
        return dateTime.toDate();
    }

    /**
     * 字符串转 Date
     *
     * @param date 字符串日期时间，格式需要与 {@link #STANDARD_FORMAT} 保持一致（例: 2018-07-17 10:47:00）
     * @return
     */
    public static Date strToDate(String date) {
        return strToDate(date, STANDARD_FORMAT);
    }

    /**
     * Date 转字符串时间
     *
     * @param date Date 日期时间
     * @param format 格式
     * @return
     */
    public static String dateToStr(Date date, String format) {
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(format);
    }

    /**
     * Date 转字符串时间
     *
     * @param date Date 日期时间
     * @return
     */
    public static String dateToStr(Date date) {
        return dateToStr(date, STANDARD_FORMAT);
    }
}
