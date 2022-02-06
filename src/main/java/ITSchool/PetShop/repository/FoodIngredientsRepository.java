package ITSchool.PetShop.repository;

import ITSchool.PetShop.entity.Accessories;
import ITSchool.PetShop.entity.FoodIngredients;

import java.util.ArrayList;
import java.util.List;

public class FoodIngredientsRepository {

    private List<FoodIngredients> foodIngredients = new ArrayList<>();

    public List<FoodIngredients> getAllFoodIngredients() {
        System.out.println("Getting all foodIngredients");
        return this.foodIngredients;
    }

    public void addFoodIngredients(FoodIngredients foodIngredients) {
        this.foodIngredients.add(foodIngredients);
        System.out.println("Added a new foodIngredient: " + foodIngredients);
    }

    public FoodIngredients getAllFoodIngredientsById(int id) {
        return getFoodIngredients(id);
    }

    public void deleteFoodIngredients(int id) {
        FoodIngredients foodIngredients = getFoodIngredients(id);
        System.out.println("Deleting foodIngredient: " + foodIngredients);
        this.foodIngredients.remove(foodIngredients);
    }

    public void updateFoodIngredients(int id, FoodIngredients foodIngredients) {
        FoodIngredients oldFoodIngredients = getFoodIngredients(id);
        System.out.println("Updating foodIngredient: " + foodIngredients);
        System.out.println("New foodIngredient: " + foodIngredients);
        this.foodIngredients.set(this.foodIngredients.indexOf(foodIngredients), foodIngredients);

    }

    private FoodIngredients getFoodIngredients(int id) {
        System.out.println("Getting foodIngredient with id: " + id);
        for (FoodIngredients foodIngredients : this.foodIngredients) {
            if (foodIngredients.getId()== id)
                return foodIngredients;
        }
        return null;
    }
}
