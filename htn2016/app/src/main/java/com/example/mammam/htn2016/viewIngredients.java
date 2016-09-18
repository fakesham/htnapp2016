package com.example.mammam.htn2016;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/*
public class SimpleListViewActivity extends Activity {

  private ListView mainListView ;
  private ArrayAdapter<String> listAdapter ;
@Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Find the ListView resource.
        mainListView = (ListView) findViewById( R.id.mainListView );

        // Create and populate a List of planet names.
        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
        "Jupiter", "Saturn", "Uranus", "Neptune"};
        ArrayList<String> planetList = new ArrayList<String>();
        planetList.addAll( Arrays.asList(planets) );

        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, planetList);

        // Add more planets. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.
        listAdapter.add( "Ceres" );
        listAdapter.add( "Pluto" );
        listAdapter.add( "Haumea" );
        listAdapter.add( "Makemake" );
        listAdapter.add( "Eris" );

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter( listAdapter );
        }
        }
        */

public class viewIngredients extends Activity {

    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_ingredients);

        // cast ingredients list view as a list view
        mainListView = (ListView) findViewById(R.id.ingredientsListView);

        // make the new ingredient list
        ArrayList<String> ingredients = new ArrayList<String>();

       /* Ingredient toAdd = new Ingredient("wow cool"); // test
        ingredients.add(toAdd);
        toAdd = new Ingredient("please work"); // test
        ingredients.add(toAdd);
        toAdd = new Ingredient("kill me now"); // test
        ingredients.add(toAdd);
        toAdd = new Ingredient("aaah"); // test
        ingredients.add(toAdd);
        toAdd = new Ingredient("poop"); // test
        ingredients.add(toAdd);*/

        ingredients.add("cow");
        ingredients.add("omg");
        ingredients.add("I hate my life");



        // make list adapter for the arraylist
        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, ingredients);


        mainListView.setAdapter(listAdapter); */


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

        // make button to go to removeIngredient screen
        Button goRemoveIngredients = (Button) findViewById(R.id.removebutton);
        goRemoveIngredients.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(viewIngredients.this, removeIngredients.class);
                startActivity(intent);
            }
        });
    }


}
