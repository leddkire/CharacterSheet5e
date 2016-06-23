package com.example.leddkire.charactersheet5e;

/**
 * Created by leddkire on 23/6/2016.
 */
//Ability Increase class
//This class represents the ability score increases that a certain race or subrace provides.
public class Ability_Increase {
    int _strength_increase;
    int _dexterity_increase;
    int _constitution_increase;
    int _intelligence_increase;
    int _wisdom_increase;
    int _charisma_increase;

    public Ability_Increase(){
        _strength_increase =0;
        _dexterity_increase=0;
        _constitution_increase=0;
        _intelligence_increase=0;
        _wisdom_increase=0;
        _charisma_increase=0;
    }

    public int get_strength_increase() {
        return _strength_increase;
    }

    public void set_strength_increase(int _strength_increase) {
        this._strength_increase = _strength_increase;
    }

    public int get_dexterity_increase() {
        return _dexterity_increase;
    }

    public void set_dexterity_increase(int _dexterity_increase) {
        this._dexterity_increase = _dexterity_increase;
    }

    public int get_constitution_increase() {
        return _constitution_increase;
    }

    public void set_constitution_increase(int _constitution_increase) {
        this._constitution_increase = _constitution_increase;
    }

    public int get_intelligence_increase() {
        return _intelligence_increase;
    }

    public void set_intelligence_increase(int _intelligence_increase) {
        this._intelligence_increase = _intelligence_increase;
    }

    public int get_wisdom_increase() {
        return _wisdom_increase;
    }

    public void set_wisdom_increase(int _wisdom_increase) {
        this._wisdom_increase = _wisdom_increase;
    }

    public int get_charisma_increase() {
        return _charisma_increase;
    }

    public void set_charisma_increase(int _charisma_increase) {
        this._charisma_increase = _charisma_increase;
    }
}
