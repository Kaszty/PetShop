package ITSchool.PetShop.repository;

import ITSchool.PetShop.entity.WalkingAccessories;
import java.util.ArrayList;
import java.util.List;

public class WalkingAccessoriesRepository {

    private List<WalkingAccessories> walkingAccessories = new ArrayList<>();

    public List<WalkingAccessories> getAllWalkingAccessories() {
        System.out.println("Getting all walkingAccessories");
        return this.walkingAccessories;
    }

    public void addWalkingAccessories(WalkingAccessories walkingAccessories) {
        this.walkingAccessories.add(walkingAccessories);
        System.out.println("Added a new walkingAccessory: " + walkingAccessories);
    }

    public WalkingAccessories getAllWalkingAccessoriesById(int id) {
        return getWalkingAccessories(id);
    }

    public void deleteWalkingAccessories(int id) {
        WalkingAccessories walkingAccessories = getWalkingAccessories(id);
        System.out.println("Deleting walkingAccessory: " + walkingAccessories);
        this.walkingAccessories.remove(walkingAccessories);
    }

    public void updateWalkingAccessories(int id, WalkingAccessories walkingAccessories) {
        WalkingAccessories oldWalkingAccessories = getWalkingAccessories(id);
        System.out.println("Updating walkingAccessory: " + walkingAccessories);
        System.out.println("New accessory: " + walkingAccessories);
        this.walkingAccessories.set(this.walkingAccessories.indexOf(walkingAccessories), walkingAccessories);
    }

    private WalkingAccessories getWalkingAccessories(int id) {
        System.out.println("Getting walkingAccessory with id: " + id);
        for (WalkingAccessories walkingAccessories : this.walkingAccessories) {
            if (walkingAccessories.getId()== id)
                return walkingAccessories;
        }
        return null;
    }
}
