package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import java.sql.*;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity
{
    Button toSenior, toChild, toPet, makePost;
    FloatingActionButton toMessages;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        startListener();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toSenior = findViewById(R.id.button_senior);
        toSenior.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                moveToSenior();
            }
        });

        toChild = findViewById(R.id.button_child);
        toChild.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                moveToChild();
            }
        });


        toPet = findViewById(R.id.button_pet);
        toPet.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                moveToPet();
            }
        });


        toMessages = findViewById(R.id.contacts);
        toMessages.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                moveToMessages();
            }
        });

        makePost = findViewById(R.id.button_join);
        makePost.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                moveToPost();
            }
        });


    }

    public void moveToMessages()
    {
        Intent intent = new Intent(MainActivity.this, Messages.class);
        startActivity(intent);
    }

    public void moveToPet()
    {
        Intent intent = new Intent(MainActivity.this, advertise.class);
        intent.putExtra("type", "pet");
        startActivity(intent);
    }
    public void moveToSenior()
    {
        Intent intent = new Intent(MainActivity.this, advertise.class);
        intent.putExtra("type", "senior");
        startActivity(intent);
    }
    public void moveToChild()
    {
        Intent intent = new Intent(MainActivity.this, advertise.class);
        intent.putExtra("type","child");
        startActivity(intent);
    }

    public void startListener()
    {
        Thread listener = new Thread(() ->
        {
            try
            {
                this.run();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        });
        listener.start();
    }

    public void run()
    {
        while (true)
        {
            User user = new User();
            user.getUserInput();
        }
    }

    public void moveToPost()
    {
        Intent intent = new Intent(MainActivity.this, Post.class);
        startActivity(intent);
    }

}