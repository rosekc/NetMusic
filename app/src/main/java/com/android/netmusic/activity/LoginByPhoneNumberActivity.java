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

public class LoginByPhoneNumberActivity extends AppCompatActivity {

    LinearLayout mBack;
    LinearLayout mClear;
    TextView mCode;
    EditText mPhoneNumber;
    EditText mPassword;
    TextView mForgetPassword;
    Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_by_phone_number);

        mCode = (TextView) findViewById(R.id.login_phone_number_code);
        mPassword=(EditText)findViewById(R.id.login_phone_number_password);

        mClear = (LinearLayout) findViewById(R.id.login_phone_number_clear);
        mClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPhoneNumber.setText("");
            }
        });

        mForgetPassword = (TextView) findViewById(R.id.login_forget_password);
        mForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mBack = (LinearLayout) findViewById(R.id.login_by_phone_number_back);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mPhoneNumber = (EditText) findViewById(R.id.login_phone_number);
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
                    mClear.setVisibility(View.INVISIBLE);
                    mCode.setTextColor(getResources().getColor(R.color.login_edit_text_clear));
                } else {
                    mClear.setVisibility(View.VISIBLE);
                    mCode.setTextColor(getResources().getColor(R.color.login_edit_text_normal));
                }
            }
        });

        mForgetPassword = (TextView) findViewById(R.id.login_forget_password);
        mForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginByPhoneNumberActivity.this,"(ง •_•)ง",Toast.LENGTH_SHORT).show();
            }
        });

        mLogin = (Button) findViewById(R.id.login_button_login);
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mPhoneNumber.getText().toString().length()!=11){
                    Toast.makeText(LoginByPhoneNumberActivity.this,"请输入正确的手机号",Toast.LENGTH_SHORT).show();
                    mPhoneNumber.requestFocus();
                }else if(mPassword.getText().toString().length()<6){
                    Toast.makeText(LoginByPhoneNumberActivity.this,"请输入多于六位的密码",Toast.LENGTH_SHORT).show();
                    mPassword.requestFocus();
                }else {
                    Intent intent = new Intent(LoginByPhoneNumberActivity.this, MainActivity.class);
                    startActivity(intent);
                    if (LoginActivity.sLoginActivity != null) LoginActivity.sLoginActivity.finish();
                    finish();
                }
            }
        });
    }
}
