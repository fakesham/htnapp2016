package com.example.mammam.htn2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* SHAM'S RESPONSIBILITY */
        // ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        // initialize ingredient arraylist
        /* END SHAM'S RESPONSIBILITY */

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



    }
}

