package com.heflat.utils.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Json 工具类
 *
 * @author heflat
 * @date 2018-07-17 15:29
 */
public class JsonUtil {

    /**
     * Object 转 Json
     *
     * @param object Object 对象
     * @return
     */
    public static String toJson(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }

    /**
     * Object 转 Json
     * 格式化输出
     *
     * @param object Object 对象
     * @return
     */
    public static String toJsonPrint(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }

    /**
     * Json 转 Object
     *
     * @param json Json 字符串
     * @param clazz Object.class
     * @return
     */
    public static Object toObject(String json, Class clazz) {
        Gson gson = new Gson();
        return gson.fromJson(json, clazz);
    }

    /**
     * Json 转 List<T>
     *
     * @param json json 字符串
     * @param type new TypeToken<List<T>>() {}.getType()
     * @return
     */
    public static <T> List<T> toList(String json, Type type) {
        Gson gson = new Gson();
        return gson.fromJson(json, type);
    }
}
