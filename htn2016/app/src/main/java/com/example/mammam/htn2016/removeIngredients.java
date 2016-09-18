package com.example.mammam.htn2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class removeIngredients extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_ingredients);
    }

    ArrayList<Ingredient> ingredientList = new ArrayList<Ingredient>();

    /*ArrayAdapter adapter = new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1, ingredientList);
    yourlistview.setAdapter(adapter);*/
}
