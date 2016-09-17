public class Ingredient {

    String name;

    public Ingredient(String name){
        this.name = name;
    }

    public Ingredient addIngredient(String name){
        Ingredient newIngredient = new Ingredient(name);

    }
}
