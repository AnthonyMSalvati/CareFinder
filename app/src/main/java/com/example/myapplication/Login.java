package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.widget.Button;
import android.view.View;

import com.example.myapplication.R;

public class Login extends AppCompatActivity {

    Button toSignup, toMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        toSignup = findViewById(R.id.sign_up);
        toSignup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                moveToSignupPage();

            }
        });

        toMain = findViewById(R.id.login_try);
        toMain.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                moveToMainPage();
            }
        });
    }


    public void moveToSignupPage()
    {
        Intent intent = new Intent(Login.this, SignUp.class);
        startActivity(intent);
    }

    public void moveToMainPage()
    {
        Intent intent = new Intent(Login.this, MainActivity.class);
        startActivity(intent);
    }
}
