package ITSchool.PetShop.repository;

import ITSchool.PetShop.entity.Food;
import java.util.ArrayList;
import java.util.List;

public class FoodRepository {

    private List<Food> food = new ArrayList<>();

    public List<Food> getAllFood() {
        System.out.println("Getting all foods");
        return this.food;
    }

    public void addFood(Food food) {
        this.food.add(food);
        System.out.println("Added a new food: " + food);
    }

    public Food getAllFoodById(int id) {
        return getFood(id);
    }

    public void deleteFood(int id) {
        Food food = getFood(id);
        System.out.println("Deleting food: " + food);
        this.food.remove(food);
    }

    public void updateFood(int id, Food food) {
        Food oldFood = getFood(id);
        System.out.println("Updating food: " + food);
        System.out.println("New food: " + food);
        this.food.set(this.food.indexOf(oldFood), food);
    }

    private Food getFood(int id) {
        System.out.println("Getting food with id: " + id);
        for (Food food : this.food) {
            if (food.getId()== id)
                return food;
        }
        return null;
    }

}
