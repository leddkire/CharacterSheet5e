package com.example.leddkire.charactersheet5e;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Get the intent object that started this activity
        Intent intent = getIntent();
        //Extract the message
        String message = intent.getStringExtra((CharacterSheet.EXTRA_MESSAGE));
        //Create a textView element for the string
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        //Get the layout view called 'content'
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textView);

    }

}
