package com.android.netmusic.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.netmusic.R;
import com.android.netmusic.tool.CheckValidity;

public class RegisterActivity extends AppCompatActivity {

    LinearLayout mBack;
    LinearLayout mClearPhoneNumber;
    LinearLayout mClearPassword;
    Button mFinish;
    Button mWechat;
    Button mQQ;
    Button mWeibo;
    Button mNetease;
    EditText mPhoneNumber;
    EditText mPassword;
    TextView mCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mCode = (TextView) findViewById(R.id.register_phone_number_code);

        mBack = (LinearLayout) findViewById(R.id.register_back);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mFinish = (Button) findViewById(R.id.register_button_finish);
        mFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mPhoneNumber.getText().toString().length()!=11|| !CheckValidity.checkPhoneNumber(mPhoneNumber.getText().toString())){
                    Toast.makeText(RegisterActivity.this,"请输入正确的手机号",Toast.LENGTH_SHORT).show();
                    mPhoneNumber.requestFocus();
                }else if(mPassword.getText().toString().length()<6){
                    Toast.makeText(RegisterActivity.this,"请输入多于六位的密码",Toast.LENGTH_SHORT).show();
                    mPassword.requestFocus();
                }else{
                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                    if (LoginActivity.sLoginActivity != null) LoginActivity.sLoginActivity.finish();
                    finish();
                }
            }
        });

        mWechat = (Button) findViewById(R.id.login_button_wechat);
        mWechat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mQQ = (Button) findViewById(R.id.login_button_qq);
        mQQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mWeibo = (Button) findViewById(R.id.login_button_weibo);
        mWeibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mNetease = (Button) findViewById(R.id.login_button_netease);
        mNetease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mClearPhoneNumber = (LinearLayout) findViewById(R.id.register_phone_number_clear);
        mClearPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPhoneNumber.setText("");
            }
        });

        mClearPassword = (LinearLayout) findViewById(R.id.register_password_clear);
        mClearPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPassword.setText("");
            }
        });

        mPhoneNumber = (EditText) findViewById(R.id.register_phone_number);
        mPhoneNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().equals("")) {
                    mClearPhoneNumber.setVisibility(View.INVISIBLE);
                    mCode.setTextColor(getResources().getColor(R.color.login_edit_text_clear));
                } else {
                    mClearPhoneNumber.setVisibility(View.VISIBLE);
                    mCode.setTextColor(getResources().getColor(R.color.login_edit_text_normal));
                }
            }
        });

        mPassword=(EditText)findViewById(R.id.register_password);
        mPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().equals("")) {
                    mClearPassword.setVisibility(View.INVISIBLE);
                } else {
                    mClearPassword.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
