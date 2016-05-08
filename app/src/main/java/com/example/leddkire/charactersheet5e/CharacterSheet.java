package com.example.leddkire.charactersheet5e;

//Imports Intent Object constructor
import android.content.Intent;
//
import android.os.Bundle;
//
import android.support.design.widget.FloatingActionButton;
//
import android.support.design.widget.Snackbar;
//
import android.support.v7.app.AppCompatActivity;
//
import android.support.v7.widget.Toolbar;
//
import android.view.View;
//
import android.view.Menu;
//
import android.view.MenuItem;
//Imports EditText element constructor
import android.widget.EditText;

public class CharacterSheet extends AppCompatActivity {

    //Definitions
    //Id's
    public final static String EXTRA_MESSAGE = "com.leddkire.charactersheet5e.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_sheet);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_character_sheet, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //Called when a user wants to create a new character.
    //Starts a new activity with an empty character form to fill out.
    public void start_new_character_activity(View view) {
        Intent new_character_intent = new Intent(this, NewCharacterActivity.class);
        startActivity(new_character_intent);
    }

    //Called when a user wants to load an existing character.
    //Fills the space below the buttons with a list of saved characters.
    //The characters are saved in text files (for now). Consider using a database to store them
    //  instead.
    public void show_saved_characters(View view) {
    }
}
