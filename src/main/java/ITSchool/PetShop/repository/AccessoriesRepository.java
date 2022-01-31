package ITSchool.PetShop.repository;

import ITSchool.PetShop.entity.Accessories;

import java.util.ArrayList;
import java.util.List;

public class AccessoriesRepository {

    private List<Accessories> accessories = new ArrayList<>();

    public List<Accessories> getAllAccessories() {
        return this.accessories;
    }

    public void addAccesories(Accessories accessories) {
        this.accessories.add(accessories);
        System.out.println("Am adaugat cu succes un accesories");
    }

    public Accessories getAllAccessoriesById(int id) {
        for (Accessories accessories : this.accessories) {
            if (accessories.getId()== id)
                return accessories;
        }
        return null;
    }
}
