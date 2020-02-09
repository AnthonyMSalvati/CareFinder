package com.example.myapplication;


import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class User extends AppCompatActivity
{
	private String firstName, lastName, address, password, email, userName;
	private int userID;

	public User ()
    {


	}

	public void sendToSQL()
	{

	}

	public void getUserInput()
	{

	}


    private void setName()
	{
	   	TextView nameField = findViewById(R.id.username);
	   	String temp = nameField.getText().toString();
	   	this.firstName = temp.split(" ")[0];
	   	this.lastName = temp.split(" ")[1];
	}

    public String getName()
    {
        TextView nameField = findViewById(R.id.username);
        userName = nameField.getText().toString();

        return userName;
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
        else
        {
            passwordField.setText("Passwords do not match");
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
