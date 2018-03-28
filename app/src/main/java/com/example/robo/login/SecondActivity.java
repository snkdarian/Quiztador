package com.example.robo.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(this);
        Button btnSwitchToLogin = findViewById(R.id.btnSwitchToLogin);
        btnSwitchToLogin.setOnClickListener(this);
        EditText userInput = findViewById(R.id.userInput);
        EditText pswInput = findViewById(R.id.pswInput);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSwitchToLogin:
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            default:
                break;

        }
    }
}
