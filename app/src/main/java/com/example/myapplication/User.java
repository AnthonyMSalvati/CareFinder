package com.example.myapplication;


import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class User extends AppCompatActivity
{
    private String name, password, email;

    public User user()
    {

        return null;
    }


    public String getName()
    {
        TextView nameField = findViewById(R.id.username);
        name = nameField.getText().toString();
        return name;
    }

    public String getPassword()
    {
        String passOne;
        String passTwo;
        TextView passwordField = findViewById(R.id.password_one);
        TextView passwordFieldTwo = findViewById(R.id.password_two);

        passOne = passwordField.getText().toString();
        passTwo = passwordFieldTwo.getText().toString();

        if (passOne.equals(passTwo))
        {
            password = passOne;
        }
        return password;
    }

    public String getEmail()
    {
        TextView emailField = findViewById(R.id.user_email);
        email = emailField.getText().toString();

        return email;
    }

}
