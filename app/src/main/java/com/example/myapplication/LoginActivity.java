package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {


    Button btn_cancel, btn_acepted;
    TextView user, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_acepted = findViewById(R.id.accepted);
        btn_cancel = findViewById(R.id.cancel);
        user = findViewById(R.id.user);
        password = findViewById(R.id.password);


        btn_acepted.setOnClickListener(v -> login(this.getApplicationContext()));
        btn_cancel.setOnClickListener(v -> finish());

    }

    public void login(Context cv) {
        String userSt = user.getText().toString();
        String passwordSt = password.getText().toString();
        Intent intent = new Intent(cv, MainActivity.class);

        if (userSt.equals("admin") && passwordSt.equals("admin")) {
            intent.putExtra("type", 1);
            startActivity(intent,null);

        }


        if (userSt.equals("user") && passwordSt.equals("user")) {
            intent.putExtra("type", 2);
            startActivity(intent,null);
        }

    }


}
