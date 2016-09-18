package com.example.mammam.htn2016;

/**
 * Created by mammam on 2016-09-17.
 */
public class Ingredient {
    String name;

    public Ingredient(String name){
        this.name = name;
    }

    public Ingredient addIngredient(String name){
        Ingredient newIngredient = new Ingredient(name);

    }

    public String toString(){
        return this.name;
    }
}