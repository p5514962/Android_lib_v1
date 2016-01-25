package com.eascs.app.common_lib.untils;

/**
 * @author KevinHo
 * @version V1.0
 * @ClassName: ConvertUntil
 * @Description: 基本数据类型转换方法
 * @email 20497342@qq.com
 * @date
 */
public class ConvertUntil {

    private static ConvertUntil intance;

    public static ConvertUntil getIntance() {
        if (null == intance) {
            synchronized (ConvertUntil.class) {
                if (null == intance) {
                    intance = new ConvertUntil();
                }
            }
        }
        return intance;
    }

    /**
     * 字符串强转整形
     *
     * @param value        目标字符串
     * @param defaultValue 默认值
     * @return
     */
    public int convertToInt(String value, int defaultValue) {
        int result = defaultValue;
        try {
            result = Integer.parseInt(value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return result;
        }
    }

    /**
     * 字符串强转单精度
     *
     * @param value        目标字符串
     * @param defaultValue 默认值
     * @return
     */
    public float convertToFloat(String value, float defaultValue) {
        float result = defaultValue;
        try {
            result = Float.parseFloat(value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return result;
        }
    }

    /**
     * 字符串强转双精度
     *
     * @param value        目标字符串
     * @param defaultValue 默认值
     * @return
     */
    public double convertToDouble(String value, double defaultValue) {
        double result = defaultValue;
        try {
            result = Integer.parseInt(value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return result;
        }
    }

    /**
     * @param value
     * @param start
     * @param end 截取到光标前一位
     * @return
     */
    public String substring(String value, int start, int end) {

        if(start >= end){
            return "";
        }

        if (!(start > value.length())) {
            return "";
        }
        if (end > value.length()) {//可等于
            return "";
        }
        return value.substring(start, end);
    }


}
