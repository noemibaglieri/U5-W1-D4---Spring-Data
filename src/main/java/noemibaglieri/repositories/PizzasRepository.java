package noemibaglieri.repositories;

import noemibaglieri.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzasRepository extends JpaRepository<Pizza, Long> {

    List<Pizza> findByName(String name);

    boolean existsByName(String name);

}
