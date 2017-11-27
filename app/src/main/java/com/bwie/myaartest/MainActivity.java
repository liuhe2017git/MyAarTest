package com.bwie.myaartest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bwie.myaar.AddUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(AddUtil.add(1,5));
        //测试---a --
        //测试

    }
}
