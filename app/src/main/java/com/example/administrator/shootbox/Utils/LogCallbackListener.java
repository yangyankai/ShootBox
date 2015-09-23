package com.example.administrator.shootbox.Utils;


/**
 * ************************************************************************
 * Created: 杨艳凯
 * Date:    2015/8/10
 * Project: Shootbox
 * Version: 1.0
 * *************************************************************************
 */
public interface LogCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
