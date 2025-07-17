package noemibaglieri.services;

import noemibaglieri.entities.Pizza;
import noemibaglieri.exceptions.ValidationException;
import noemibaglieri.repositories.PizzasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzasService {
    @Autowired
    private PizzasRepository pizzasRepository;

    public void savePizza(Pizza newPizza) {

        if(pizzasRepository.existsByName(newPizza.getName())) throw new ValidationException("Pizza: " + newPizza.getName() + " is already present in the database.");

        if(pizzasRepository.)

    }
}
