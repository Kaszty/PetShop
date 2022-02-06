package ITSchool.PetShop.repository;

import ITSchool.PetShop.entity.Toys;
import java.util.ArrayList;
import java.util.List;

public class ToysRepository {

    private List<Toys> toys = new ArrayList<>();

    public List<Toys> getAllToys() {
        System.out.println("Getting all toys");
        return this.toys;
    }

    public void addToys(Toys toys) {
        this.toys.add(toys);
        System.out.println("Added a new toy: " + toys);
    }

    public Toys getAllToysById(int id) {
        return getToys(id);
    }

    public void deleteToys(int id) {
        Toys toys = getToys(id);
        System.out.println("Deleting toy: " + toys);
        this.toys.remove(toys);
    }

    public void updateToys(int id, Toys toys) {
        Toys oldToys = getToys(id);
        System.out.println("Updating toy: " + toys);
        System.out.println("New toy: " + toys);
        this.toys.set(this.toys.indexOf(oldToys), toys);
    }

    private Toys getToys(int id) {
        System.out.println("Getting toy with id: " + id);
        for (Toys toys : this.toys) {
            if (toys.getId()== id)
                return toys;
        }
        return null;
    }
}
