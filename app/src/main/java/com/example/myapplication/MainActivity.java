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

    Connection myConn;
    String DBurl = "jdbc:mysql://localhost:3306/people";
    String DBusername = "skirk";
    String DBpwd = "43268790";
    String DBip = "127.0.0.1";
    String DBschema = "people";
    String retrieve = "";

    protected String getEmployee(String filter)
    {
        String stmt = "select * from employees cross join people on employees.employeeID = " +
                "people.userID where(" + filter + ")";
        return stmt;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView userNameField = findViewById(R.id.username_field);
        TextView emailField = findViewById(R.id.user_email);
        TextView password1Field = findViewById(R.id.password_one);
        TextView password2Field = findViewById(R.id.password_two);


        try {
            myConn = DriverManager.getConnection(DBurl, DBusername, DBpwd);
            Statement myStmt = myConn.createStatement();
            //ResultSet myRS = myStmt.executeQuery();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }


        toSenior = findViewById(R.id.button_senior);
        /*
         * TODO: pull senior data and move to use_page with that data
         */

        toChild = findViewById(R.id.button_child);
        /*
         * TODO: pull child data and move to use_page with that data
         */

        toPet = findViewById(R.id.button_pet);
        /*
         * TODO: pull pet data and move to use_page with that data
         */

        toAdvertise = findViewById(R.id.button_join);
        toAdvertise.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                moveToAdvertise();
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


    }

    public void moveToAdvertise()
    {
        Intent intent = new Intent(MainActivity.this, advertise.class);
        startActivity(intent);
    }

    public void moveToMessages()
    {
        Intent intent = new Intent(MainActivity.this, Messages.class);
        startActivity(intent);
    }
}