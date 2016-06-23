package com.example.leddkire.charactersheet5e;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

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
        //Check if the name is not null
        String char_string = char_name.getText().toString();
        if(checkStringEmpty(char_string)){
            char_name.setHint("Please enter a name");
        }
        else {
            int str_int = parseStatInt(R.id.str_value);
            int dex_int = parseStatInt(R.id.dex_value);
            int con_int = parseStatInt(R.id.con_value);
            int int_int = parseStatInt(R.id.int_value);
            int wis_int = parseStatInt(R.id.wis_value);
            int cha_int = parseStatInt(R.id.cha_value);
            Character new_character = new Character(char_string, str_int, dex_int, con_int, int_int, wis_int, cha_int);
            //Initialize the database
            Database_Handler db = new Database_Handler(this);
            db.add_character(new_character);
            //Close the activity
            finish();
        }
    }

    private int parseStatInt(int id){
        String s = getStringFromEditT(id);
        return ZeroIfNull(s);

    }

    private int ZeroIfNull(String s){
        if(s.length()==0){
            return 0;
        }
        else{
            return Integer.parseInt(s);
        }
    }

    private String getStringFromEditT(int id){
        EditText et = (EditText) findViewById(id);
        return et.getText().toString();
    }

    private boolean checkStringEmpty(String s){
        if(s.length() == 0) {
            return true;
        }
        else {
            return false;
        }
    }


}
