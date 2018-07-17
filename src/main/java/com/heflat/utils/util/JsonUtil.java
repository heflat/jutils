package com.heflat.utils.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Json 工具类
 *
 * @author heflat
 * @date 2018-07-17 15:29
 */
public class JsonUtil {

    /**
     * Object 转 Json 格式
     *
     * @param object
     * @return
     */
    public static String toJson(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }

    /**
     * Object 转 Json 格式
     * 格式化输出
     *
     * @param object
     * @return
     */
    public static String toJsonPrint(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }

    /**
     * Json 格式转 Object
     *
     * @param json
     * @param clazz
     * @return
     */
    public static Object toObject(String json, Class clazz) {
        Gson gson = new Gson();
        return gson.fromJson(json, clazz);
    }
}
