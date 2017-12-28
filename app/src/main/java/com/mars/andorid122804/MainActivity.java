package com.mars.andorid122804;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        Uri uri = Uri.parse("http://tw.yahoo.com");//開網頁
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void  click2(View v)//開地圖
    {
        Uri uri = Uri.parse("geo:0,0?q=岡山統一戲院");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void  click3(View v)//撥電話
    {
        Uri uri = Uri.parse("tel:02 2259 1027");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }



}
