package com.example.leddkire.charactersheet5e;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.WrapperListAdapter;

import java.util.ArrayList;
import java.util.List;

public class LoadCharListActivity extends AppCompatActivity {
    ArrayList<Character> characters = new ArrayList<Character>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_char_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        DatabaseHandler db = new DatabaseHandler(this);
        characters = db.getAllCharacters();
        ListView listV = (ListView) findViewById(R.id.listView);
        ListAdapter listA = new ArrayAdapter<Character>(this, android.R.layout.simple_list_item_1, characters);
        listV.setAdapter(listA);

        db.get_Character('1');
    }
}
