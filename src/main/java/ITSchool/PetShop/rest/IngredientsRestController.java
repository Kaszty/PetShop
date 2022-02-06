package ITSchool.PetShop.rest;

import ITSchool.PetShop.entity.Ingredients;
import ITSchool.PetShop.repository.IngredientsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class IngredientsRestController {

    IngredientsRepository ingredientsRepository = new IngredientsRepository();

    @GetMapping("/get-ingredients")
    public List<Ingredients> getIngredients(){
        return ingredientsRepository.getAllIngredients();
    }

    @GetMapping("/get-ingredients/{id}")
    public Ingredients getIngredientsById(@PathVariable int id){
        return ingredientsRepository.getAllIngredientsById(id);
    }

    @PostMapping("/create-ingredients")
    public void createIngredients(@RequestBody Ingredients ingredients){
        ingredientsRepository.addIngredients(ingredients);
    }

    @DeleteMapping("/delete-ingredients/{id}")
    public void deleteIngredients(@PathVariable int id){
        ingredientsRepository.deleteIngredients(id);
    }

    @PutMapping("/update-ingredients/{id}")
    public void updateIngredients(@PathVariable int id, @RequestBody Ingredients ingredients){
        ingredientsRepository.updateIngredients(id, ingredients);
    }
}
