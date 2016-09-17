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

Ingredient[] ingredients = new Ingredient[50];
// initialize ingredient array 

int ingredientIndex = 0; 
// keep track of where we are in the array 

 
/* Function: add ingredient to array 
	Input: string for name 
	Return val: ingredient that was just created */   
public Ingredient addIngredient(String name){

	try{
		// check if ingredients list is already full 
		// TODO: how tf do I add a popup error??????
		// OK I will try to use Toast 

		Ingredient newIngredient = new Ingredient(name);
		ingredient[ingredientIndex] = newIngredient; 
		ingredientIndex++; 
	}
	catch(ArrayOutOfBoundsException e){
		Helper.tooMuchFoodException(this, 
			"You have too many ingredients! 
			Try deleting some.");
	}

    return newIngredient; 
}

/* Function: display toast message about 
having too many ingredients */ 
public static void tooMuchFoodException(Context context, String msg){
	Toast.makeText(context, msg, Toast.LENGTH_LONG).show(); 
}

ListView ingredientListView = (Listview) findViewById(R.id.ingredientListView); 
// initialize ingredient list view 

ArrayAdapter<Ingredient> adapter = new ArrayAdapter<Ingredient>(this, 
	android.R.layout.simple_list_item_1, ingredients);
// initialize adapter 

ingredientListView.setAdapter(adapter); 
// this will convert ingredients array to list view 