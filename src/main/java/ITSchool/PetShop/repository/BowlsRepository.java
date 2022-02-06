package ITSchool.PetShop.repository;

import ITSchool.PetShop.entity.Bowls;
import java.util.ArrayList;
import java.util.List;

public class BowlsRepository {

    private List<Bowls> bowls = new ArrayList<>();

    public List<Bowls> getAllBowls() {
        System.out.println("Getting all bowls");
        return this.bowls;
    }

    public void addBowls(Bowls bowls) {
        this.bowls.add(bowls);
        System.out.println("Added a new bowl: " + bowls);
    }

    public Bowls getAllBowlsById(int id) {
        return getBowls(id);
    }

    public void deleteBowls(int id) {
        Bowls bowls = getBowls(id);
        System.out.println("Deleting bowl: " + bowls);
        this.bowls.remove(bowls);
    }

    public void updateBowls(int id, Bowls bowls) {
        Bowls oldBowl = getBowls(id);
        System.out.println("Updating bowl: " + bowls);
        System.out.println("New bowl: " + bowls);
        this.bowls.set(this.bowls.indexOf(oldBowl), bowls);
    }

    private Bowls getBowls(int id) {
        System.out.println("Getting bowl with id: " + id);
        for (Bowls bowls : this.bowls) {
            if (bowls.getId()== id)
                return bowls;
        }
        return null;
    }
}
