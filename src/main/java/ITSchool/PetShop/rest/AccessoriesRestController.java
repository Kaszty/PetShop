package ITSchool.PetShop.rest;

import ITSchool.PetShop.entity.Accessories;
import ITSchool.PetShop.repository.AccessoriesRepository;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Log4j2
public class AccessoriesRestController {

    private static final Logger logger = LogManager.getLogger(AccessoriesRestController.class);
    @Autowired
    AccessoriesRepository accessoriesRepository;

    @GetMapping("/get-accessories")
    public ResponseEntity<Iterable<Accessories>> getAccessories() {
        logger.info("Getting all accessories");
        return new ResponseEntity<>(accessoriesRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/get-accessories/{id}")
    public ResponseEntity<Accessories> getAccessoriesById(@PathVariable Long id) {
        final Optional<Accessories> optionalAccessories = accessoriesRepository.findById(id);
        return optionalAccessories.map(accessories -> new ResponseEntity<>(accessories, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.BAD_REQUEST));
    }

    @PostMapping("/create-accessories")
    public ResponseEntity<Accessories> createAccessories(@RequestBody Accessories accessories) {
        try {
            return new ResponseEntity<>(accessoriesRepository.save(accessories), HttpStatus.OK);
        } catch (DataIntegrityViolationException e) {
            logger.error("DataIntegrityViolationException: accessories {} already exists", accessories.getName());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete-accessories/{id}")
    public ResponseEntity<Void> deleteAccessories(@PathVariable Long id) {
        accessoriesRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update-accessories/{id}")
    public ResponseEntity<Void> updateAccessories(@PathVariable Long id, @RequestBody Accessories accessories) {
        accessoriesRepository.update(accessories.getName(), id);
        return ResponseEntity.ok().build();
    }
}
