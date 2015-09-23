package com.example.administrator.shootbox.Utils;

import android.content.Context;
/**
 * ************************************************************************
 * Created: 杨艳凯
 * Date:    2015/8/10
 * Project: Shootbox
 * Version: 1.0
 * *************************************************************************
 */
public class AsyncAddLogUtil {
    public static void addLog(final Context context, final String str,final LogCallbackListener listener) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                LogUtil.addLog(context, str);
                String s= "ok";
                listener.onFinish(s);
            }
        }).start();
    }
}
