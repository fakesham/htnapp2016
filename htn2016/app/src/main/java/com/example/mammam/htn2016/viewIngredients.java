package com.example.mammam.htn2016;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class viewIngredients extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_ingredients);

        // make button to go to addIngredient screen
        Button goAddIngredients = (Button) findViewById(R.id.addbutton);
        goAddIngredients.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(viewIngredients.this, addIngredients.class);
                startActivity(intent);
            }
        });

        // make button to go back to welcome screen
        Button goBack = (Button) findViewById(R.id.backbutton);
        goBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(viewIngredients.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
