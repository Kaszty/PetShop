package ITSchool.PetShop.rest;

import ITSchool.PetShop.entity.Toys;
import ITSchool.PetShop.repository.ToysRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class ToysRestController {

    ToysRepository toysRepository = new ToysRepository();

    @GetMapping("/get-toys")
    public List<Toys> getToys(){
        return toysRepository.getAllToys();
    }

    @GetMapping("/get-toys/{id}")
    public Toys getToysById(@PathVariable int id){
        return toysRepository.getAllToysById(id);
    }

    @PostMapping("/create-toys")
    public void createToys(@RequestBody Toys toys){
        toysRepository.addToys(toys);
    }

    @DeleteMapping("/delete-toys/{id}")
    public void deleteToys(@PathVariable int id){
        toysRepository.deleteToys(id);
    }

    @PutMapping("/update-toys/{id}")
    public void updateToys(@PathVariable int id, @RequestBody Toys toys){
        toysRepository.updateToys(id, toys);
    }

}
