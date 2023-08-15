package com.aayush.signinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        MaterialButton loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(v -> {
            if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this,"LOGIN FAILED", Toast.LENGTH_SHORT).show();
            }
        });
    }
}