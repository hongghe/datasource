package com.hongghe.datasouce.utility;

/**
 * 日期时间的组件
 *
 * @author hongghe 09/07/2018
 */
public class TimeUtility {

    /**
     * 获取此时的时间戳
     *
     * @return 10位时间戳
     */
    public Long getTimestamp() {
        return System.currentTimeMillis()/1000L;
    }

    /**
     * 日期转化位10时间戳
     *
     * @param date 日期的字符串
     * @return 10位时间戳
     */
    public Long convertDateToTimestamp(String date) {
        return 1L;
    }
}
