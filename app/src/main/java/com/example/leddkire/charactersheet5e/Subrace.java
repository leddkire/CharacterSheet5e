package com.example.leddkire.charactersheet5e;

/**
 * Created by leddkire on 23/6/2016.
 */

//Subrace Class
//Stores information about the subrace traits of a specific race.
public class Subrace {
    String _subrace_name;
    Ability_Increase _subrace_ability_increase;
    String[] _features;

    public Subrace(){
        _subrace_name = "No name";
        _subrace_ability_increase = new Ability_Increase();
        _features = new String[]{};
    }

    public String get_subrace_name() {
        return _subrace_name;
    }

    public void set_subrace_name(String _subrace_name) {
        this._subrace_name = _subrace_name;
    }

    public Ability_Increase get_subrace_ability_increase() {
        return _subrace_ability_increase;
    }

    public void set_subrace_ability_increase(Ability_Increase _subrace_ability_increase) {
        this._subrace_ability_increase = _subrace_ability_increase;
    }

    public String[] get_features() {
        return _features;
    }

    public void set_features(String[] _features) {
        this._features = _features;
    }
}
