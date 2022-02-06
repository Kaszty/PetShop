package ITSchool.PetShop.rest;

import ITSchool.PetShop.entity.FoodIngredients;
import ITSchool.PetShop.repository.FoodIngredientsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class FoodIngredientsRestController {

    FoodIngredientsRepository foodIngredientsRepository = new FoodIngredientsRepository();

    @GetMapping("/get-foodIngredients")
    public List<FoodIngredients> getFoodIngredients(){
        return foodIngredientsRepository.getAllFoodIngredients();
    }

    @GetMapping("/get-foodIngredients/{id}")
    public FoodIngredients getFoodIngredientsById(@PathVariable int id){
        return foodIngredientsRepository.getAllFoodIngredientsById(id);
    }

    @PostMapping("/create-foodIngredients")
    public void createFoodIngredients(@RequestBody FoodIngredients foodIngredients){
        foodIngredientsRepository.addFoodIngredients(foodIngredients);
    }

    @DeleteMapping("/delete-foodIngredients/{id}")
    public void deleteFoodIngredients(@PathVariable int id){
        foodIngredientsRepository.deleteFoodIngredients(id);
    }

    @PutMapping("/update-foodIngredients/{id}")
    public void updateFoodIngredients(@PathVariable int id, @RequestBody FoodIngredients foodIngredients){
        foodIngredientsRepository.updateFoodIngredients(id,foodIngredients);
    }
}
