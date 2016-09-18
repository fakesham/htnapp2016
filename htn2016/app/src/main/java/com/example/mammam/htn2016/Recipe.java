package com.example.mammam.htn2016;
import android.database.Cursor;

//import com.<recipe_app>.client.database.RecipeTable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sophianguyen on 16-09-17.
 */
// Represents a recipe
public class Recipe {

    public static final String URL_BASE = "http://...";  // Get it
    private String name;
    private List<Ingredient> ingredients = new ArrayList<Ingredient>(); // We should get it from some database (i.e. API)

    // Constructor
    public Recipe(String name) {
        this.name = name;
    }

    // EFFECTS: Returns name of recipe
    public String getName() {
        return name;
    }

    // EFFECTS: Returns url
    public String getUrl() {
        return URL_BASE + this.name;
    }

    // EFFECTS: Returns ingredients in recipe
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    // EFFECTS: Add ingredients to recipe
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    // EFFECT: Static helper method to return recipe from database query
    public static Recipe fromCursor(Cursor cursor) {
        Recipe recipe = new Recipe(null);
        for (int c = 0; c < cursor.getColumnCount(); c++) {
            String columnName = cursor.getColumnName(c);
            /*if (columnName.equals(RecipeTable.ID_COLUMN)) {
                recipe.name = cursor.getString(c);
            }*/
        }
        return recipe;
    }
}
