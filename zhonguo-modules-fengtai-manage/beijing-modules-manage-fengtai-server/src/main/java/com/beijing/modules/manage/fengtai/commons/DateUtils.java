package com.beijing.modules.manage.fengtai.commons;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


/**
 * @author fengrz
 * @since 2020-05-07
 */
@Slf4j
public class DateUtils {

    public static final String DEFAULT_FORMATTER = "yyyy-MM-dd HH:mm:ss";
    public static final String DEFAULT_FORMATTER_YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
    public static final String DEFAULT_FORMATTER_YYYY_MM_DD = "yyyy-MM-dd";

    /**
     *获取当前时间
     */
    public static LocalDateTime now(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter =   DateTimeFormatter.ofPattern(DEFAULT_FORMATTER, Locale.CHINA);
        String ldTime = localDateTime.format(dateTimeFormatter);
        return LocalDateTime.parse(ldTime,dateTimeFormatter);
    }

    public static LocalDateTime now(String formatter){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter =   DateTimeFormatter.ofPattern(formatter, Locale.CHINA);
        String ldTime = localDateTime.format(dateTimeFormatter);
        return LocalDateTime.parse(ldTime,dateTimeFormatter);
    }

    /**
     *将String类型的时间转换为LocalDateTime
     */
    public static LocalDateTime parse(String Date,String pattern){
        if(null == Date){
            return null;
        }
        DateTimeFormatter dateTimeFormatter =   DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(Date, dateTimeFormatter).atStartOfDay();
    }
    /**
     *将String类型的时间转换为LocalDateTime
     */
    public static LocalDateTime format(String Date,String pattern){
        if(null == Date){
            return null;
        }
        DateTimeFormatter dateTimeFormatter =   DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(Date, dateTimeFormatter);
    }

    public static String formatDate (String date){
        if(StringUtils.isBlank(date)){
            return null;
        }
        try {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = format.parse(date);
            return format.format(parse);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

}
