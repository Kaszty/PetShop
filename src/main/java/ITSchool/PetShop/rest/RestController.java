package ITSchool.PetShop.rest;

import ITSchool.PetShop.entity.Accessories;
import ITSchool.PetShop.repository.AccessoriesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

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
        accessoriesRepository.addAccesories(accessories);
    }

}
