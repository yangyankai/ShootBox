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

    // ��ȡ��ǰʱ�䣬��ʽYYYY-MM-DD HH:MM:SS
    static public String GetCurDate()
    {
        //�������ڸ�ʽ
        SimpleDateFormat simpleDateFormaat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // new Date()Ϊ��ȡ��ǰϵͳʱ��
        String strCurDate = (simpleDateFormaat.format(new Date())).toString();

        return strCurDate;
    }

    // ��ȡ��ǰʱ�䣬��ʽYYYYMMDDHHMMSS
    static public String GetCurDateNotFormat()
    {
        //�������ڸ�ʽ
        SimpleDateFormat simpleDateFormaat = new SimpleDateFormat("yyyyMMddHHmmss");

        // new Date()Ϊ��ȡ��ǰϵͳʱ��
        String strCurDate = (simpleDateFormaat.format(new Date())).toString();

        return strCurDate;
    }


    // ��ȡ��ǰʱ�䣬��ʽYYYYMMDDHHMMssSS
    static public String GetCurDateForDirectoryUse()
    {
        //�������ڸ�ʽ
        SimpleDateFormat simpleDateFormaat = new SimpleDateFormat("yyyyMMddHHmmssSS");

        // new Date()Ϊ��ȡ��ǰϵͳʱ��
        String strCurDate = (simpleDateFormaat.format(new Date())).toString();

        return strCurDate;
    }

    // ��ȡ��ǰʱ�䣬��ʽYYYY-MM-DD HH:MM:SS.mli
    static public String GetCurMsDate()
    {
        //�������ڸ�ʽ
        SimpleDateFormat simpleDateFormaat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");
        // new Date()Ϊ��ȡ��ǰϵͳʱ��
        String strCurDate = (simpleDateFormaat.format(new Date())).toString();
        return strCurDate;
    }
}
