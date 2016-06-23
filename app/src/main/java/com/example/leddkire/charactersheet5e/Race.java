package com.example.leddkire.charactersheet5e;

/**
 * Created by leddkire on 23/6/2016.
 */

//Race Class
//This class will store the information of a race.
public class Race {
    String _race_name;
    Ability_Increase _base_ability_increase;
    int _age;
    String _alignment;
    int _size;
    String[] _languages;
    Subrace _subrace;
    String[] _features;

    public Race (){
        _race_name ="No name";
        _base_ability_increase = new Ability_Increase();
        _age = 0;
        _alignment = "No alignment";
        _size = 0;
        _languages = new String[]{"Common"};
        _subrace = new Subrace();
        _features = new String[]{};

    }

    public String get_race_name() {
        return _race_name;
    }

    public void set_race_name(String _race_name) {
        this._race_name = _race_name;
    }

    public Ability_Increase get_base_ability_increase() {
        return _base_ability_increase;
    }

    public void set_base_ability_increase(Ability_Increase _base_ability_increase) {
        this._base_ability_increase = _base_ability_increase;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public String get_alignment() {
        return _alignment;
    }

    public void set_alignment(String _alignment) {
        this._alignment = _alignment;
    }

    public int get_size() {
        return _size;
    }

    public void set_size(int _size) {
        this._size = _size;
    }

    public String[] get_languages() {
        return _languages;
    }

    public void set_languages(String[] _languages) {
        this._languages = _languages;
    }

    public Subrace get_subrace() {
        return _subrace;
    }

    public void set_subrace(Subrace _subrace) {
        this._subrace = _subrace;
    }

    public String[] get_features() {
        return _features;
    }

    public void set_features(String[] _features) {
        this._features = _features;
    }
}
