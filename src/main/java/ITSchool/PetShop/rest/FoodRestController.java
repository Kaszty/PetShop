package ITSchool.PetShop.rest;

import ITSchool.PetShop.entity.Food;
import ITSchool.PetShop.repository.FoodRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class FoodRestController {

    FoodRepository foodRepository = new FoodRepository();

    @GetMapping("/get-food")
    public List<Food> getFood(){
        return foodRepository.getAllFood();
    }

    @GetMapping("/get-food/{id}")
    public Food getFoodById(@PathVariable int id){
        return foodRepository.getAllFoodById(id);
    }

    @PostMapping("/create-food")
    public void createFood(@RequestBody Food food){
        foodRepository.addFood(food);
    }

    @DeleteMapping("/delete-food/{id}")
    public void deleteFood(@PathVariable int id){
        foodRepository.deleteFood(id);
    }

    @PutMapping("/update-food/{id}")
    public void updateFood(@PathVariable int id, @RequestBody Food food){
        foodRepository.updateFood(id, food);
    }

}
