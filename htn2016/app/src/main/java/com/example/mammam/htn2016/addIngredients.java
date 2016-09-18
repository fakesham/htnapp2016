package com.example.mammam.htn2016;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class addIngredients extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ingredients);


        final ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

        final EditText newIngredient = (EditText)findViewById(R.id.addIngredientPrompt);
        // the ID of the text field is "addIngredientPrompt"
        final String toAdd = newIngredient.getText().toString();
        // take the input from the text field and add it into
        // a string "toAdd"; this will be the name attribute for
        // the newly created ingredient

        Button goDoneAdding= (Button) findViewById(R.id.doneAddingIngredient);
        // this button adds the ingredient and goes back to list view of ingredients
        // button ID for "done" button is "doneAddingIngredient"
        goDoneAdding.setOnClickListener(new View.OnClickListener(){

            @Override
            /* Function: performs everything that happens when "done" button clicked */
            public void onClick(View view){

                //Ingredient newIngredient = new Ingredient(toAdd);
                ///ingredients.add(newIngredient);
                // create a new ingredient and add it to
                // ArrayList<Ingredients> ingredients
                // ISSUE: we can't share the arraylist across activities
                Toast.makeText(getApplicationContext(), "u added a new ing", Toast.LENGTH_SHORT).show();

                //Intent intent= new Intent(addIngredients.this, viewIngredients.class);
                // it goes from addIngredients to viewIngredients
                //startActivity(intent);
            }
        });

        Button goAddMore= (Button) findViewById(R.id.addMore);
        // this button adds the ingredient and goes back to the add more screen
        // button ID for "add more" button is "addMore"
        goAddMore.setOnClickListener(new View.OnClickListener(){

            @Override
            /* Function: performs everything that happens when "add more" button clicked */
            public void onClick(View view){

                Ingredient newIngredient = new Ingredient(toAdd);
                ingredients.add(newIngredient);
                // create a new ingredient and add it to
                // ArrayList<Ingredients> ingredients

                Intent intent= new Intent(addIngredients.this, addIngredients.class);
                // it goes from addIngredients to addIngredients
                startActivity(intent);
            }
        });
    }
}
