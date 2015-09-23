package com.example.administrator.shootbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.administrator.shootbox.Utils.AsyncAddLogUtil;
import com.example.administrator.shootbox.Utils.JsonUtil;
import com.example.administrator.shootbox.Utils.LogCallbackListener;
import com.example.administrator.shootbox.Utils.LogUtil;
import com.example.administrator.shootbox.Utils.ReadFromRaw;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  //      String strResult=ReadFromRaw.read(this.getApplicationContext());
//        JsonUtil.parseJson(strResult);



//        AsyncAddLogUtil.addLog(this.getApplicationContext(), "ceshi 2", new LogCallbackListener() {
//            @Override
//            public void onFinish(String response) {
//                Log.e("aaa", "ceshi2" + response);
//            }
//
//            @Override
//            public void onError(Exception e) {
//
//            }
//        });

//        LogUtil.addLog(this.getApplicationContext(),"test 3");
//        LogUtil.readLog(this.getApplicationContext());

        sendRequestWithHttpClient();


    }
    private void sendRequestWithHttpClient(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    HttpClient httpClient=new DefaultHttpClient();
                    HttpGet httpGet=new HttpGet("http://m.weather.com.cn/data/101110101.html");
                    HttpResponse httpResponse= httpClient.execute(httpGet);
                    if(httpResponse.getStatusLine().getStatusCode()==200){
                        HttpEntity entity=httpResponse.getEntity();
                        String response= EntityUtils.toString(entity,"utf-8");
                   //     parseJSONWithObject(response);
                        Log.e("aaaa",""+response);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }

}
