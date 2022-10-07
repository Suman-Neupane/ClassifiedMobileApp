package com.example.classifiedappmain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class login extends AppCompatActivity {
    MaterialButton material_login;
    TextView textLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);

        material_login=findViewById(R.id.material_login);
        textLogin=findViewById(R.id.textSignUp);
        material_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login.this,MainActivity.class);
                startActivity(i);
            }
        });
        textLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login.this,RegistrationPage.class);
                startActivity(i);
            }
        });
    }
}