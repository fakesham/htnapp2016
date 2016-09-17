/* SAMPLE CODE */ 
/*public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ListView listView1 = (ListView) findViewById(R.id.listView1);
        
        String[] items = { "Milk", "Butter", "Yogurt", "Toothpaste", "Ice Cream" };
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, items);
        
        listView1.setAdapter(adapter);
    }
}*/

ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>(); 
// initialize ingredient arraylist 
 
/* Function: add ingredient to array 
	Input: string for name 
	Return val: ingredient that was just created */   
public Ingredient addIngredient(String name){
	Ingredient newIngredient = new Ingredient(name);
	ingredients.add(Ingredient newIngredient);
    return newIngredient; 
}

/* Function: remove ingredient from array 
	Input: data from checkboxes (ingredient type)
	Return val: none */ 
public void removeIngredient(Ingredient toRemove){
	ingredients.remove(toRemove); 
}

ListView ingredientListView = (Listview) findViewById(R.id.ingredientListView); 
// initialize ingredient list view 

ArrayAdapter<Ingredient> adapter = new ArrayAdapter<Ingredient>(this, 
	android.R.layout.simple_list_item_1, ingredients);
// initialize adapter 

ingredientListView.setAdapter(adapter); 
// this will convert ingredients array to list view 