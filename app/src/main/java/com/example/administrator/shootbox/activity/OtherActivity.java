package com.example.administrator.shootbox.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.example.administrator.shootbox.R;
import com.example.administrator.shootbox.Utils.LogUtil;

/**
 * Created by Administrator on 2015/8/12.
 */
public class OtherActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("aaa", "other");
        Log.e("aaa", this.getPackageName());
        LogUtil.addLog(this, "ddeeff");

        LogUtil.readLog(this.getApplicationContext());
    }
}
