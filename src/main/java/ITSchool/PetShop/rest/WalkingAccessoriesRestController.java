package ITSchool.PetShop.rest;

import ITSchool.PetShop.entity.WalkingAccessories;
import ITSchool.PetShop.repository.WalkingAccessoriesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class WalkingAccessoriesRestController {

    WalkingAccessoriesRepository walkingAccessoriesRepository = new WalkingAccessoriesRepository();

    @GetMapping("/get-walkingAccessories")
    public List<WalkingAccessories> getWalkingAccessories(){
        return walkingAccessoriesRepository.getAllWalkingAccessories();
    }

    @GetMapping("/get-walkingAccessories/{id}")
    public WalkingAccessories getWalkingAccessoriesById(@PathVariable int id){
        return walkingAccessoriesRepository.getAllWalkingAccessoriesById(id);
    }

    @PostMapping("/create-walkingAccessories")
    public void createWalkingAccessories(@RequestBody WalkingAccessories walkingAccessories){
        walkingAccessoriesRepository.addWalkingAccessories(walkingAccessories);
    }

    @DeleteMapping("/delete-walkingAccessories/{id}")
    public void deleteWalkingAccessories(@PathVariable int id){
        walkingAccessoriesRepository.deleteWalkingAccessories(id);
    }

    @PutMapping("/update-walkingAccessories/{id}")
    public void updateWalkingAccessories(@PathVariable int id, @RequestBody WalkingAccessories walkingAccessories){
        walkingAccessoriesRepository.updateWalkingAccessories(id, walkingAccessories);
    }
}
