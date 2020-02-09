package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import java.sql.*;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity
{
    Button toSenior, toChild, toPet, toAdvertise;
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
                advertise ad = new advertise();
                ad.whoToPull("senior");
            }
        });

        toChild = findViewById(R.id.button_child);
        toChild.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                advertise ad = new advertise();
                ad.whoToPull("child");
            }
        });


        toPet = findViewById(R.id.button_pet);
        toPet.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                advertise ad = new advertise();
                ad.whoToPull("pet");
            }
        });


        /*toAdvertise = findViewById(R.id.button_join);
        toAdvertise.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                moveToAdvertise();
            }
        });*/

        toMessages = findViewById(R.id.contacts);
        toMessages.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                moveToMessages();
            }
        });


    }

    /*public void moveToAdvertise()
    {
        Intent intent = new Intent(MainActivity.this, advertise.class);
        startActivity(intent);
    }*/

    public void moveToMessages()
    {
        Intent intent = new Intent(MainActivity.this, Messages.class);
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
}