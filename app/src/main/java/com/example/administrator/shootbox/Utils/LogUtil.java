package com.example.administrator.shootbox.Utils;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


/**
 * ************************************************************************
 * Created: 杨艳凯
 * Date:    2015/8/10
 * Project: Shootbox
 * Version: 1.0
 * *************************************************************************
 */
public class LogUtil {

    //取目录         如：  "/data/data/包名/log"
    public static String getLogDirectory(Context context) {
        return  "/data/data/"+context.getPackageName()+"/log";
    }

    //取文件路径   如:  "/data/data/包名/log/20150707070707007.log"
    public static String getLogPath(Context context){
        return getLogDirectory(context)+"/"+GenDate.GetCurDateForDirectoryUse()+".log";
    }

    /**
     *
     * @param context  上下文
     * @param strLog   日志内容
     * @return     true:成功    false:失败
     */
    public synchronized static boolean addLog(Context context,String strLog) {
        String logDirectory=getLogDirectory(context);
        String logPath=getLogPath(context);

        File fileDirecory = new File(logDirectory);
        if(!fileDirecory.exists()) {        //  if  the   file directory not exit
            fileDirecory.mkdirs();        // create the file directory
        }
        String m_logPath=logPath;
        File file = new File(m_logPath);
        if (!file.exists()) {   //  if the file not exit ,so create new file
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // file and file directory both exit, add the new log
        write(m_logPath,strLog);
//        Log.e("aaa","add new log"+m_logPath);

        return true;
    }


    /**
     *  写日志操作
     * @param logPath  文件路径,如:   "/data/data/包名/log/20150707070707007.log"
     * @param strLog   日志内容
     */
    private synchronized static void write(String logPath,String strLog){
        File fWrite=new File(logPath);
        try {
            Writer out=new FileWriter(fWrite);
            BufferedWriter bufferedWriter=new BufferedWriter(out);
            String str=null;
            bufferedWriter.write(strLog);
            bufferedWriter.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *    导出  String m_path="/data/data/com.package.name/log"  目录下所有日志
     * @return
     */
    public static boolean readLog(Context context) {
        String logDirectory=getLogDirectory(context);

        File fileDirecory = new File(logDirectory);
        if(!fileDirecory.exists()) {        //  if  the   file directory not exit,return false
            return false;
        }
        else{
            String fileName[] = fileDirecory.list();
            for (String name : fileName) {
                Log.e("aaa", logDirectory+ name);
                read(fileDirecory + "/" + name);
            }
        }
        return true;
    }

    private static void read(String filePath) {
        File fRead = new File(filePath);
        if (fRead.exists()) {
            try {
                Reader in = new FileReader(fRead);
                BufferedReader bufferedReader = new BufferedReader(in);
                String str = null;
                while ((str = bufferedReader.readLine()) != null) {
                    Log.e("aaa", ":"+str);

                }
                bufferedReader.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
                Log.e("aaa", "read ["+filePath+"] fail");
            }
        }
        else {
            Log.e("aaa","file not exit");
        }
    }
}
