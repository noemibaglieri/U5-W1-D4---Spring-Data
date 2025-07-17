package noemibaglieri.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "drinks")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    private String name;
    private double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
