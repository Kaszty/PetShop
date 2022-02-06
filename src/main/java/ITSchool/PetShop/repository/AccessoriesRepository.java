package ITSchool.PetShop.repository;

import ITSchool.PetShop.entity.Accessories;
import java.util.ArrayList;
import java.util.List;

public class AccessoriesRepository {

    private List<Accessories> accessories = new ArrayList<>();

    public List<Accessories> getAllAccessories() {
        System.out.println("Getting all accessories");
        return this.accessories;
    }

    public void addAccessories(Accessories accessories) {
        this.accessories.add(accessories);
        System.out.println("Added a new accessory: " + accessories);
    }

    public Accessories getAllAccessoriesById(int id) {
        return getAccessories(id);
    }

    public void deleteAccessories(int id) {
        Accessories accessories = getAccessories(id);
        System.out.println("Deleting accessory: " + accessories);
        this.accessories.remove(accessories);
    }

    public void updateAccessories(int id, Accessories accessories) {
        Accessories oldAccessories = getAccessories(id);
        System.out.println("Updating accessory: " + accessories);
        System.out.println("New accessory: " + accessories);
        this.accessories.set(this.accessories.indexOf(oldAccessories), accessories);
    }

    private Accessories getAccessories(int id) {
        System.out.println("Getting accessory with id: " + id);
        for (Accessories accessories : this.accessories) {
            if (accessories.getId()== id)
                return accessories;
        }
        return null;
    }

}


