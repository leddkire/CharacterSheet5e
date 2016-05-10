package com.example.leddkire.charactersheet5e;

/**
 * Created by leddkire on 8/5/2016.
 */

//Character class for storing all the information for a character


public class Character {
    int _id;
    String _name;
    int _str;
    int _dex;
    int _con;
    int _int;
    int _wis;
    int _cha;

    public Character(){}

    public Character(int _id, String _name, int _str, int _dex, int _con, int _int, int _wis, int _cha) {
        this._id = _id;
        this._name = _name;
        this._str = _str;
        this._dex = _dex;
        this._con = _con;
        this._int = _int;
        this._wis = _wis;
        this._cha = _cha;
    }

    public Character(String _name, int _str, int _dex, int _con, int _int, int _wis, int _cha) {
        this._name = _name;
        this._str = _str;
        this._dex = _dex;
        this._con = _con;
        this._int = _int;
        this._wis = _wis;
        this._cha = _cha;
    }

    public String toString(){
        return this._name;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_str() {
        return _str;
    }

    public void set_str(int _str) {
        this._str = _str;
    }

    public int get_dex() {
        return _dex;
    }

    public void set_dex(int _dex) {
        this._dex = _dex;
    }

    public int get_con() {
        return _con;
    }

    public void set_con(int _con) {
        this._con = _con;
    }

    public int get_int() {
        return _int;
    }

    public void set_int(int _int) {
        this._int = _int;
    }

    public int get_wis() {
        return _wis;
    }

    public void set_wis(int _wis) {
        this._wis = _wis;
    }

    public int get_cha() {
        return _cha;
    }

    public void set_cha(int _cha) {
        this._cha = _cha;
    }
}
