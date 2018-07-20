package com.heflat.jutils.util;

import com.heflat.jutils.enums.CodeEnum;
import com.heflat.jutils.exception.JUtilsException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 *
 *
 * @author heflat
 * @date 2018-07-20 08:54
 */
@Slf4j
public class PropertiesUtil {

    static final String PROPERTIES_FILE = "jutils.properties";

    private static Properties prop;

    static {
        prop = new Properties();

        try {
            prop.load(new InputStreamReader(PropertiesUtil.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE), "UTF-8"));
        } catch (IOException e) {
            log.error("【读取配置文件错误】{}", e);
            throw new JUtilsException(CodeEnum.READ_PROPERTIES_FILE_ERROR);
        }
    }

    /**
     * 根据 key 值获取 value 值
     * @param key key 值
     * @param defaultValue 默认值，key 值为空时，返回该值
     * @return
     */
    public static String getProperty(String key, String defaultValue) {
        String value = prop.getProperty(key.trim());
        if (StringUtils.isNotBlank(value)) {
            return value.trim();
        }

        return defaultValue;
    }

    /**
     * 根据 key 值获取 value 值
     * key 值为空时，返回 null
     *
     * @param key
     * @return
     */
    public static String getProperty(String key) {
        return getProperty(key, null);
    }
}
