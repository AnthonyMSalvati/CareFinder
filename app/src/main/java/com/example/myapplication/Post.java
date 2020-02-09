package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Post extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Button submitBut;
        RadioGroup radioGroup;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_advert);


        radioGroup = findViewById(R.id.advert_type);


        submitBut = findViewById(R.id.submit_post);
        submitBut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                RadioButton radioButton;
                String content, postType;
                int cost;

                int selectedID = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selectedID);

                cost = Integer.parseInt(findViewById(R.id.rate).toString());
                postType = radioButton.getText().toString();
                content = findViewById(R.id.user_self_description).toString();

                submitData(content, postType, cost);
            }
        });
    }

    public void submitData(String post, String type, int rate)
    {

        //TODO: submit data to SQL database

    }

}
