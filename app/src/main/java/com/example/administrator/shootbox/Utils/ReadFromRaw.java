package com.example.administrator.shootbox.Utils;

import android.content.Context;
import android.util.Log;

import com.example.administrator.shootbox.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;


/**
 * ************************************************************************
 * Created: 杨艳凯
 * Date:    2015/8/10
 * Project: Shootbox
 * Version: 1.0
 * *************************************************************************
 */
public class ReadFromRaw {
    public static String  read(Context context){
        String line="";
        InputStream inputStream;

        inputStream = context.getResources().openRawResource(R.raw.p);
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(inputStream, "gbk");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(inputStreamReader);
        StringBuffer sb = new StringBuffer("");

        try {
            while ((line = reader.readLine()) != null)
            {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.e("aaa", sb.toString());
        return sb.toString();
    }

}
