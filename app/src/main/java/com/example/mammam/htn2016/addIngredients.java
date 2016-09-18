package com.example.mammam.htn2016;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addIngredients extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ingredients);

        Button goDoneAdding= (Button) findViewById(R.id.doneAddingIngredient);
        // this button adds the ingredient and goes back to list view of ingredients
        // button ID for "done" button is "doneAddingIngredient"

        final EditText newIngredient = (EditText)findViewById(R.id.addIngredientPrompt);
        // the ID of the text field is "addIngredientPrompt"
        String toAdd = newIngredient.getText().toString();
        // take the input from the text field and add it into
        // a string "toAdd"; this will be the name attribute for
        // the newly created ingredient

        goDoneAdding.setOnClickListener(new View.OnClickListener(){

            @Override
            /* Function: performs everything that happens when "done" button clicked */
            public void onClick(View view){

                Ingredient newIngredient = new Ingredient(toAdd);
                ingredients.add(newIngredient);
                // create a new ingredient and add it to
                // ArrayList<Ingredients> ingredients

                Intent intent= new Intent(addIngredients.this, viewIngredients.class);
                // it goes from addIngredients to viewIngredients
                startActivity(intent);
            }
        });

        Button goAddMore= (Button) findViewById(R.id.addMore);
        // this button adds the ingredient and goes back to the add more screen
        // button ID for "add more" button is "addMore"
        goDoneAdding.setOnClickListener(new View.OnClickListener(){

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
