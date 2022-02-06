package ITSchool.PetShop.rest;

import ITSchool.PetShop.entity.Accessories;
import ITSchool.PetShop.entity.Bowls;
import ITSchool.PetShop.repository.BowlsRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class BowlsRestController {

        BowlsRepository bowlsRepository = new BowlsRepository();

        @GetMapping("/get-bowls")
        public List<Bowls> getBowls(){
            return bowlsRepository.getAllBowls();
        }

        @GetMapping("/get-bowls/{id}")
        public Bowls getBowlsById(@PathVariable int id){
            return bowlsRepository.getAllBowlsById(id);
        }

        @PostMapping("/create-bowls")
        public void createBowls(@RequestBody Bowls bowls){
            bowlsRepository.addBowls(bowls);
        }

        @DeleteMapping("/delete-bowls/{id}")
        public void deleteBowls(@PathVariable int id){
            bowlsRepository.deleteBowls(id);
        }

        @PutMapping("/update-bowls/{id}")
        public void updateBowls(@PathVariable int id, @RequestBody Bowls bowls){
            bowlsRepository.updateBowls(id, bowls);
        }
}
