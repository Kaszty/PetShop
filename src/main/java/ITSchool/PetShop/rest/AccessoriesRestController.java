package ITSchool.PetShop.rest;

import ITSchool.PetShop.entity.Accessories;
import ITSchool.PetShop.repository.AccessoriesRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class AccessoriesRestController {

    AccessoriesRepository accessoriesRepository = new AccessoriesRepository();

    @GetMapping("/get-accessories")
    public List<Accessories> getAccessories(){
        return accessoriesRepository.getAllAccessories();
    }

    @GetMapping("/get-accessories/{id}")
    public Accessories getAccessoriesById(@PathVariable int id){
        return accessoriesRepository.getAllAccessoriesById(id);
    }

    @PostMapping("/create-accessories")
    public void createAccessories(@RequestBody Accessories accessories){
        accessoriesRepository.addAccessories(accessories);
    }

    @DeleteMapping("/delete-accessories/{id}")
    public void deleteAccessories(@PathVariable int id){
        accessoriesRepository.deleteAccessories(id);
    }

    @PutMapping("/update-accessories/{id}")
    public void updateAccessories(@PathVariable int id, @RequestBody Accessories accessories){
        accessoriesRepository.updateAccessories(id, accessories);
    }
}
