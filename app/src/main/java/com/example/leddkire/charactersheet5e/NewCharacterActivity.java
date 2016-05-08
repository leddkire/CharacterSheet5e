package com.example.leddkire.charactersheet5e;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import com.example.leddkire.charactersheet5e.FileManagement;

public class NewCharacterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_character);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void save_character(View view) {
        //Get the info that's going to be saved
        EditText char_name = (EditText) findViewById(R.id.char_name);
        EditText str_value = (EditText) findViewById(R.id.str_value);
        EditText dex_value = (EditText) findViewById(R.id.dex_value);
        EditText con_value = (EditText) findViewById(R.id.con_value);
        EditText int_value = (EditText) findViewById(R.id.int_value);
        EditText wis_value = (EditText) findViewById(R.id.wis_value);
        EditText cha_value = (EditText) findViewById(R.id.cha_value);
        boolean writable = FileManagement.isExternalStorageWritable();
        if (writable){
            //TODO: SAVE THE INFORMATION ON A JSON FILE
        }


    }



}
