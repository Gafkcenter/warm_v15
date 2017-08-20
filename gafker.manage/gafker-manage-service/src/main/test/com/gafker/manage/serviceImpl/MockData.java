package com.gafker.manage.serviceImpl;

import com.gafker.manage.pojo.TimesTable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by gafker on 2017/8/6.
 */
public class MockData {
    public static final int DAY = 60 * 60 * 24;

    public static String getEtcTimeZone(int timeZone) {
        if (!(timeZone <= 14 && timeZone >= -14)) {
            timeZone = 0;
        }
        if (timeZone >= 0) {
            return "Etc/GMT+" + timeZone;
        } else {
            return "Etc/GMT" + timeZone;
        }

    }

    /**
     * 获取数数字时区与GMT数字相同的int
     * 时区格式不对返回null
     *
     * @param timeZone
     * @return
     */
    public static Integer getTimeZoneInt(String timeZone) {
        int timeZoneInt = 0;
        String timeZoneNumString;
        try {
            if (timeZone == null || "".equals(timeZone)) {
                return timeZoneInt;
            } else if (timeZone.startsWith("GMT")) {
                timeZoneNumString = timeZone.replace("GMT", "").replace(":00", "");
                if (timeZoneNumString != null && !"".equals(timeZoneNumString)) {
                    timeZoneInt = Integer.parseInt(timeZoneNumString);
                }
            } else if (timeZone.startsWith("Etc")) {
                timeZoneNumString = timeZone.replace("Etc/GMT", "");
                if (timeZoneNumString != null && !"".equals(timeZoneNumString)) {
                    timeZoneInt = Integer.parseInt(timeZoneNumString);
                }
            } else if (timeZone.startsWith("+") || timeZone.startsWith("-")) {
                timeZoneInt = Integer.parseInt(timeZone);
            } else {
                try {
                    timeZoneInt = Integer.parseInt(timeZone);
                } catch (Exception e) {
                    return null;
                }
            }
        } catch (Exception e) {
            return null;
        }
        return timeZoneInt;
    }

    /**
     * 获取当前秒值
     *
     * @return
     */
    public static int getSecond() {
        return (int) (getMills() / 1000);
    }

    public static long getMills() {
        TimeZone.setDefault(TimeZone.getTimeZone("Etc/GMT+0"));
        return new Date().getTime();
    }

    public static Date getDate(String timeZone) {
        if (timeZone == null || "".equals(timeZone)) {
            timeZone = "Etc/GMT+0";
        }
        TimeZone.setDefault(TimeZone.getTimeZone(timeZone));
        return new Date();
    }

    public static int getDayStartInt(int time, String timeZone) {
        if (timeZone == null || "".equals(timeZone)) {
            timeZone = "Etc/GMT+0";
        }
        int dayStart = 0;
        Long timeLong = time * 1000l;
        if (timeLong <= 0) {
            return dayStart;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
        String timeString = sdf.format(timeLong);
        try {
            Date date = sdf.parse(timeString);
            dayStart = (int) (date.getTime() / 1000);
        } catch (ParseException e) {
            return dayStart;
        }
        return dayStart;
    }

    public static int getDayEndInt(int time, String timeZone) {
        int dayStart = getDayStartInt(time, timeZone);
        int dayEnd = 0;
        if (dayStart > 0) {
            dayEnd = dayStart + DAY - 1000;
        }
        return dayEnd;
    }

    public static String getDayKey(int time, String timeZone) {
        if (timeZone == null || "".equals(timeZone)) {
            timeZone = "Etc/GMT+0";
        }
        Long longTome = time * 1000l;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
        String dayKey = sdf.format(longTome);
        return dayKey;
    }

    /**
     * 获取当前毫秒值的字符串-按时区，没有时区按0时区格式化没有时间按当前时间
     *
     * @param time     1970到现在的毫秒值
     * @param timeZone 转换到的时区
     * @return
     */
    public static String getStringDate(int time, String timeZone) {
        //确定时区
        if (timeZone == null) {
            timeZone = "Etc/GMT+0";
        }
        //得到String
        TimeZone.setDefault(TimeZone.getTimeZone(timeZone));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (time <= 0) {
            return null;

        }
        return sdf.format(time * 1000l);
    }

    public static TimesTable mockInsertTimeTable() {
        TimesTable timeTable = new TimesTable();
        timeTable.setStartTime(MockData.getSecond());
        timeTable.setStartTimeString(MockData.getStringDate(MockData.getSecond(), null));
        timeTable.setStartTimeDate(MockData.getDate(null));
        timeTable.setDayStart(MockData.getDayStartInt(timeTable.getStartTime(), "Etc/GMT+0"));
        timeTable.setDayStartString(MockData.getDayKey(timeTable.getStartTime(), "Etc/GMT+0") + " 00:00:00");
        timeTable.setStartDayKey(MockData.getDayKey(timeTable.getStartTime(), "Etc/GMT+0"));
        timeTable.setEndTime(MockData.getSecond());
        timeTable.setEndTimeString(MockData.getStringDate(timeTable.getEndTime(), null));
        timeTable.setEndTimeDate(MockData.getDate(null));
        //开始时间当天的23.59.59的秒值
        timeTable.setStartDayEnd(MockData.getDayEndInt(timeTable.getStartTime(), "Etc/GMT+0"));
        //开始时间当天的23.59.59的日期串
        timeTable.setStartDayEndString(MockData.getDayKey(timeTable.getStartTime(), "Etc/GMT+0") + " 23:59:59");
        timeTable.setEndDayKey(MockData.getDayKey(timeTable.getEndTime(), "Etc/GMT+0"));
        //timeTable.setTimeZone(0);
        //timeTable.setTimezoneetc("");
        //timeTable.setTimezonegmt("");
        timeTable.setDurationTotal(timeTable.getEndTime() - timeTable.getStartTime());
        if (timeTable.getStartDayKey().equals(timeTable.getEndDayKey())) {
            timeTable.setDurationStartDay(timeTable.getDurationTotal() > 0 ? timeTable.getDurationTotal() : 0);
        } else {
            //开始时间--当天0点时间=当天时长duration1
            int duration1 = timeTable.getStartTime() - timeTable.getDayStart();
            //总时长--当天时长=下一天的时长duration2
            int duration2 = timeTable.getDurationTotal() - duration1;
            timeTable.setDurationStartDay(duration1 > 0 ? duration1 : 0);
            timeTable.setDurationEndDay(duration2 > 0 ? duration2 : 0);
        }
        timeTable.setTel("18133064619");
        timeTable.setTelPrefix("+86");
        timeTable.setCountry(null);
        timeTable.setCountryCode(null);
        timeTable.setLanguage(null);
        timeTable.setCreateTime(MockData.getSecond());
        timeTable.setUpdateTime(MockData.getSecond());
        timeTable.setUserId(0l);
        timeTable.setContentObj("{}");
        return timeTable;
    }
}
