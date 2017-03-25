package com.android.netmusic.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.android.netmusic.R;

public class LoginActivity extends AppCompatActivity {

    LinearLayout mLoginVisitor;
    Button mLogin;
    Button mRegister;
    Button mWechat;
    Button mQQ;
    Button mWeibo;
    Button mNetease;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginVisitor = (LinearLayout) findViewById(R.id.login_visitor);
        mLogin = (Button) findViewById(R.id.login_button_phoneNumber);
        mRegister = (Button) findViewById(R.id.login_button_register);
        mWechat = (Button) findViewById(R.id.login_button_wechat);
        mQQ = (Button) findViewById(R.id.login_button_qq);
        mWeibo = (Button) findViewById(R.id.login_button_weibo);
        mNetease = (Button) findViewById(R.id.login_button_netease);

        mLoginVisitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mWechat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mQQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mWeibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mNetease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
