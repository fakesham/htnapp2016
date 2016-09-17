package com.example.jiayin.foodhtn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goViewIngredients= (Button) findViewById(R.id.button_viewIngredients);
        goViewIngredients.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent= new Intent(MainActivity.this, viewIngredients.class );
                startActivity(intent);

            }

        });

        Button goFindRecipes= (Button) findViewById(R.id.button_findRecipes);
        goFindRecipes.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent= new Intent(MainActivity.this, findRecipes.class );
                startActivity(intent);

            }

        });
        
        /* SHAM'S RESPONSIBILITY */
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        // initialize ingredient arraylist
        
       
        
        ListView ingredientListView = (Listview) findViewById(R.id.ingredientListView);
        // initialize ingredient list view (for displaying in list)
        
        ArrayAdapter<Ingredient> adapter = new ArrayAdapter<Ingredient>(this,
                                                                        android.R.layout.simple_list_item_1, ingredients);
        // initialize adapter 
        
        ingredientListView.setAdapter(adapter); 
        // this will convert ingredients array to list view
        /* END SHAM'S RESPONSIBILITY */

    }
}
