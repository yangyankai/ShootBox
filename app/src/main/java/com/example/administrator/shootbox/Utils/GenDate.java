package com.example.administrator.shootbox.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2015/8/10.
 */
public class GenDate {
    void GetDate()
    {
    }

    // 获取当前时间，格式YYYY-MM-DD HH:MM:SS
    static public String GetCurDate()
    {
        //设置日期格式
        SimpleDateFormat simpleDateFormaat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // new Date()为获取当前系统时间
        String strCurDate = (simpleDateFormaat.format(new Date())).toString();

        return strCurDate;
    }

    // 获取当前时间，格式YYYYMMDDHHMMSS
    static public String GetCurDateNotFormat()
    {
        //设置日期格式
        SimpleDateFormat simpleDateFormaat = new SimpleDateFormat("yyyyMMddHHmmss");

        // new Date()为获取当前系统时间
        String strCurDate = (simpleDateFormaat.format(new Date())).toString();

        return strCurDate;
    }


    // 获取当前时间，格式YYYYMMDDHHMMssSS
    static public String GetCurDateForDirectoryUse()
    {
        //设置日期格式
        SimpleDateFormat simpleDateFormaat = new SimpleDateFormat("yyyyMMddHHmmssSS");

        // new Date()为获取当前系统时间
        String strCurDate = (simpleDateFormaat.format(new Date())).toString();

        return strCurDate;
    }

    // 获取当前时间，格式YYYY-MM-DD HH:MM:SS.mli
    static public String GetCurMsDate()
    {
        //设置日期格式
        SimpleDateFormat simpleDateFormaat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");
        // new Date()为获取当前系统时间
        String strCurDate = (simpleDateFormaat.format(new Date())).toString();
        return strCurDate;
    }
}
