package noemibaglieri.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "pizzas")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    @ManyToMany
    @JoinTable(
            name = "pizzas_toppings",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id")
    )
    @Column(name = "topping_list")
    private List<Topping> toppingList;

    public Pizza(String name, double price, List<Topping> toppingList) {
        this.name = name;
        this.price = price;
        this.toppingList = toppingList;
    }
}
