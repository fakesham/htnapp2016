import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class addIngredients extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ingredients);

        Button goDoneAdding= (Button) findViewById(R.id.button_doneAddingIngredient);
        // this button adds the ingredient and goes back to list view of ingredients
        // button ID for "done" button is "doneAddingIngredient"
        goDoneAdding.setOnClickListener(new View.OnClickListener(){

            @Override
            /* Function: performs everything that happens when "done" button clicked */ 
            public void onClick(View view){
            	// TODO: get name from text field

            	Ingredient newIngredient = new Ingredient(name);
            	ingredients.add(Ingredient newIngredient);
            	// create a new ingredient and add it to 
            	// ArrayList<Ingredients> ingredients
            	
                Intent intent= new Intent(addIngredients.this, viewIngredients.class);
                // it goes from addIngredients to viewIngredients
                startActivity(intent);
            }
        });

        Button goAddMore= (Button) findViewById(R.id.button_addMore);
        // this button adds the ingredient and goes back to the add more screen
        // button ID for "add more" button is "addMore"
        goDoneAdding.setOnClickListener(new View.OnClickListener(){

            @Override
            /* Function: performs everything that happens when "add more" button clicked */ 
            public void onClick(View view){

                Ingredient newIngredient = new Ingredient(name);
            	ingredients.add(Ingredient newIngredient);
            	// create a new ingredient and add it to 
            	// ArrayList<Ingredients> ingredients
            	
                Intent intent= new Intent(addIngredients.this, addIngredients.class);
                // it goes from addIngredients to addIngredients
                startActivity(intent);
            }
        });
    }
}
