package com.heflat.utils.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;

/**
 * ImageBase64 工具类
 *
 * @author heflat
 * @date 2018-7-3 13:28
 */
public class ImageBase64Util {

    /**
     * Base64 编码字符串转成图片
     * @param imageName 图片名称（不包含后缀）
     * @param dest 图片保存目录
     * @param base64Image Base64 编码字符串（格式: data:image/png;base64,iVBORw0KGgoAAAANS...）
     * @throws IOException
     */
    public static void toImage(String imageName, String dest, String base64Image) throws IOException {
        int commaIndex = base64Image.indexOf(",");
        String extension = base64Image.substring(0, commaIndex).replaceAll("data:image/(.+);base64", "$1");
        byte[] content = Base64.decodeBase64(base64Image.substring(commaIndex));
        FileUtils.writeByteArrayToFile(new File(dest, imageName + "." + extension), content);
    }

    /**
     * 图片转成 Base64 编码字符串
     * @param imagePath 图片路径
     * @return
     * @throws IOException
     */
    public static String toBase64Image(String imagePath) throws IOException {
        String prefix = String.format("data:image/%s;base64,", FilenameUtils.getExtension(imagePath).toLowerCase());
        byte[] content = FileUtils.readFileToByteArray(new File(imagePath));
        return prefix + Base64.encodeBase64String(content);
    }
}
