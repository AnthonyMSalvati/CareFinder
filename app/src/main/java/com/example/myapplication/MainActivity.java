package com.example.myapplication;

import android.os.Bundle;
import java.sql.*;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.text.AutoText;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.ui.main.SectionsPagerAdapter;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
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

    public void openSignUp()
        {
            //Intent intent = new Intent
        }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button signUpButton = findViewById(R.id.button_join);
        signUpButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
                {
                openSignUp();
                }
        });
        TextView userNameField = findViewById(R.id.username_field);
        TextView emailField = findViewById(R.id.user_email);
        TextView password1Field = findViewById(R.id.password_one);
        TextView password2Field = findViewById(R.id.password_two);


        try
        {
            myConn = DriverManager.getConnection(DBurl,DBusername,DBpwd);
            Statement myStmt = myConn.createStatement();
//            ResultSet myRS = myStmt.executeQuery();
        }
        catch (java.sql.SQLException e)
        {
            e.printStackTrace();
        }



    }
}