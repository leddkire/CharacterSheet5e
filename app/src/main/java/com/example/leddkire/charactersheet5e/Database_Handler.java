package com.example.leddkire.charactersheet5e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leddkire on 8/5/2016.
 */

//Database_Handler
public class Database_Handler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 3;
    private static final String DATABASE_NAME = "characterSheet";

    //Character table
    private static final String TABLE_CHARACTER = "character";
    //Key values for Character table
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String STAT_STRENGTH = "strength";
    private static final String STAT_DEXTERITY = "dexterity";
    private static final String STAT_CONSTITUTION = "constitution";
    private static final String STAT_WISDOM = "wisdom";
    private static final String STAT_INTELLIGENCE ="intelligence";
    private static final String STAT_CHARISMA = "charisma";
    ////\\\\

    public Database_Handler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override public void onCreate(SQLiteDatabase db){
        String CREATE_CHARACTER_TABLE =
                "CREATE TABLE "+TABLE_CHARACTER+" ("         +
                        KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "     +
                        KEY_NAME + " TEXT SECONDARY KEY, "     +
                        STAT_STRENGTH + " INTEGER, "         +
                        STAT_DEXTERITY + " INTEGER, "        +
                        STAT_CONSTITUTION + " INTEGER, "     +
                        STAT_WISDOM + " INTEGER, "           +
                        STAT_INTELLIGENCE + " INTEGER, "     +
                        STAT_CHARISMA + " INTEGER"         +
                        ");";
        db.execSQL(CREATE_CHARACTER_TABLE);
    }

    @Override public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CHARACTER);
        onCreate(db);
    }
    //--------------------------------------------------------
    //Character table CRUD
    //add_character
    //Adds a character to the Character table in the database.
    //Input: A character.
    //Output: void.
    public void add_character(Character character){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(KEY_NAME, character.get_name());
        values.put(STAT_STRENGTH,character.get_str());
        values.put(STAT_DEXTERITY,character.get_dex());
        values.put(STAT_CONSTITUTION,character.get_con());
        values.put(STAT_WISDOM,character.get_wis());
        values.put(STAT_INTELLIGENCE,character.get_int());
        values.put(STAT_CHARISMA,character.get_cha());

        db.insert(TABLE_CHARACTER, null, values);
        db.close();
    }

    //get_character
    //Looks up a character in the database.
    //Input: An id pertaining to the character in question.
    //Output: The character that was found (if found).
    //TODO: change output from void to Character
    public void get_character(int id){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_CHARACTER,
                new String[]{
                        KEY_ID,
                        KEY_NAME,
                        STAT_STRENGTH,
                        STAT_DEXTERITY,
                        STAT_CONSTITUTION,
                        STAT_WISDOM,
                        STAT_INTELLIGENCE,
                        STAT_CHARISMA
                }, KEY_ID + "=?", new String[]{String.valueOf(id)},
                null, null, null, null);
        if(cursor != null)
            cursor.moveToFirst();

        Character character = new Character();
    }

    //get_all_characters
    //Obtains a list of all characters saved in the database.
    //Input: void.
    //Output: A list of Characters.
    public ArrayList<Character> get_all_characters(){
        //Initialize the character list
        ArrayList<Character> characterList = new ArrayList<Character>();
        //Select All Query
        String selectQuery = "SELECT * FROM " + TABLE_CHARACTER;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);

        if (cursor.moveToFirst()){
            do{
                Character character = new Character();
                character.set_id(Integer.parseInt(cursor.getString(0)));
                character.set_name(cursor.getString(1));
                character.set_str(Integer.parseInt(cursor.getString(2)));
                character.set_dex(Integer.parseInt(cursor.getString(3)));
                character.set_con(Integer.parseInt(cursor.getString(4)));
                character.set_wis(Integer.parseInt(cursor.getString(5)));
                character.set_int(Integer.parseInt(cursor.getString(6)));
                character.set_cha(Integer.parseInt(cursor.getString(7)));
                characterList.add(character);
            }while(cursor.moveToNext());
        }
        return characterList;
    }

    //get_char_count
    //Counts the number of characters currently in the database.
    //Input: Void.
    //Output: The number of characters currently in the database.
    public int get_char_count(){
        String countQuery = "SELECT * FROM " + TABLE_CHARACTER;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery,null);
        cursor.close();

        return cursor.getCount();
    }

    //update_char
    //Updates the information of an existing character.
    //Input: The Character with the updated info.
    //Output: An int representing the success of the update.
    public int update_char(Character character){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, character.get_name());
        values.put(STAT_STRENGTH,character.get_str());
        values.put(STAT_DEXTERITY,character.get_dex());
        values.put(STAT_CONSTITUTION,character.get_con());
        values.put(STAT_WISDOM,character.get_wis());
        values.put(STAT_INTELLIGENCE,character.get_con());
        values.put(STAT_CHARISMA,character.get_cha());

        String value_id = String.valueOf(character.get_id());
        int updated = db.update(TABLE_CHARACTER, values, KEY_ID + " = ?", new String [] {value_id});
        return  updated;
    }

    //delete_char
    //Deletes a Character in the database.
    //Input: The Character that'll be deleted.
    //Ouput: void.
    public void delete_char(Character character){
        SQLiteDatabase db = this.getWritableDatabase();
        String value_id = String.valueOf(character.get_id());
        db.delete(TABLE_CHARACTER, KEY_ID + " = ?", new String[] {value_id});
        db.close();
    }
    //--------------------------------------------------------
}
