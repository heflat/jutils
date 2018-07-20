package com.heflat.jutils.util;

import com.google.common.base.Splitter;
import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.List;

/**
 * List 工具类
 *
 * @author heflat
 * @date 2018-07-20 08:45
 */
public class ListUtil {

    /**
     * String 字符串转 List
     * @param str 字符串
     * @param separatorChars 分隔符
     * @return
     */
    public static List<String> strToList(String str, String separatorChars) {
        if (StringUtils.isBlank(str)) {
            return Collections.EMPTY_LIST;
        }
        return Splitter.on(separatorChars).splitToList(str);
    }
}
