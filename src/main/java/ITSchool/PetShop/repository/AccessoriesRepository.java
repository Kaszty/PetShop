package ITSchool.PetShop.repository;

import ITSchool.PetShop.entity.Accessories;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AccessoriesRepository extends CrudRepository<Accessories, Long> {

    @Transactional
    @Modifying
    @Query("update Accessories a set a.name = ?1 where a.id = ?2")
    void update(String name, Long id);
}


