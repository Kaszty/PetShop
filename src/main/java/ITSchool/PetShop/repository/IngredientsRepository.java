package ITSchool.PetShop.repository;


import ITSchool.PetShop.entity.Ingredients;
import java.util.ArrayList;
import java.util.List;

public class IngredientsRepository {

    private List<Ingredients> ingredients = new ArrayList<>();

    public List<Ingredients> getAllIngredients() {
        System.out.println("Getting all ingredients");
        return this.ingredients;
    }

    public void addIngredients(Ingredients ingredients) {
        this.ingredients.add(ingredients);
        System.out.println("Added a new ingredient: " + ingredients);
    }

    public Ingredients getAllIngredientsById(int id) {
        return getIngredients(id);
    }

    public void deleteIngredients(int id) {
        Ingredients ingredients = getIngredients(id);
        System.out.println("Deleting ingredient: " + ingredients);
        this.ingredients.remove(ingredients);
    }

    public void updateIngredients(int id, Ingredients ingredients) {
        Ingredients oldIngredients = getIngredients(id);
        System.out.println("Updating ingredient: " + ingredients);
        System.out.println("New ingredient: " + ingredients);
        this.ingredients.set(this.ingredients.indexOf(oldIngredients), ingredients);
    }

    private Ingredients getIngredients(int id) {
        System.out.println("Getting ingredient with id: " + id);
        for (Ingredients ingredients : this.ingredients) {
            if (ingredients.getId()== id)
                return ingredients;
        }
        return null;
    }
}
